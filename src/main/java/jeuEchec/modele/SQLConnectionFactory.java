package jeuEchec.modele;
import java.io.File;
import java.net.URL;
import java.sql.*;



    /**
     * Factory permettant d'obtenir une connexion à une BD SQLite
     *
     */
    public class SQLConnectionFactory {

        private static Connection cnx;

        private SQLConnectionFactory() { }

        public static Connection getConnection() throws SQLException{
            URL url =ClassLoader.getSystemClassLoader().getResource("db/echecs.db");
            if(cnx==null || cnx.isClosed()) cnx=DriverManager.getConnection("jdbc:sqlite:"+url);
            return cnx;
        }
    }


