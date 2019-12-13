package jeuEchec.modele;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JoueurDAO extends DAO<Joueur> {


    /**
     * Lit un objet à partir de son id
     *
     * @param id L'identifiant unique de l'objet à lire pseudo du joueur
     * @return l'objet lu ou null si l'objet n'a pu être lu
     */
    @Override
    public Joueur lire(Object id) throws DAOException {
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT pseudo FROM Joueur WHERE pseudo = ?");
            stmt.setString(1, (String)id);
            ResultSet rs = stmt.executeQuery();

            Joueur unJoueur=null;
            if(rs.next()){
                unJoueur=new Joueur((String)id);
            }

            rs.close();
            conn.close();
            return unJoueur;
        }
        catch(SQLException e){
            throw new DAOException(e);
        }


    }



    /**
     * Crée un nouvel objet
     *
     * @param joueur l'objet à ajouter dans la source de données
     * @return l'objet tel qu'il a été créé dans la source de données, null si non cree
     */
    @Override
    public Joueur créer(Joueur joueur) throws DAOException {
        Joueur unJoueur=null;
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Joueur VALUES (?)");
            stmt.setString(1, joueur.getPseudo());
            stmt.execute();

            unJoueur=lire(joueur.getPseudo());

            conn.close();

        }
        catch(SQLException e){
            throw new DAOException(e);
        }
        return unJoueur;

    }

    /**
     * Modifie un objet dans la source de données
     *
     * @param joueur l'objet à modifier dans la source de données
     * @return le joueur tel qu'il a été modifié dans la source de données null si non trouve
     */
    @Override
    public Joueur modifier(Joueur joueur) throws DAOException {
        Joueur unJoueur=null;
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("UPDATE Joueur SET pseudo WHERE pseudo=?");
            stmt.setString(1, joueur.getPseudo());
            stmt.execute();



            unJoueur=lire(joueur.getPseudo());

            conn.close();

        }
        catch(SQLException e){
            throw new DAOException(e);
        }
        return unJoueur;
    }

    /**
     * Supprime un objet de la source de données
     *
     * @param joueur l'objet à supprimer de la source de données
     * @return l'objet supprimé ou null s'il n'a pas été trouvé
     */
    @Override
    public Joueur supprimer(Joueur joueur) throws DAOException {
        Joueur unJoueur=null;
        try{
            Connection conn=SQLConnectionFactory.getConnection();

        PreparedStatement stmt = conn.prepareStatement("DELETE FROM Joueur WHERE pseudo=?");
            stmt.setString(1, joueur.getPseudo());
            stmt.execute();

            unJoueur=joueur;

            conn.close();

        }
        catch(SQLException e){
            throw new DAOException(e);
        }
        return unJoueur;
    }
}