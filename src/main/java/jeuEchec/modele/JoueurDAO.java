package jeuEchec.modele;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JoueurDAO extends DAO<Joueur> {
    /**
     * Lit un objet à partir de son id
     *
     * @param unJoueur le joueur a lire
     * @return l'objet lu ou null si l'objet n'a pu être lu
     */
    @Override
    public Joueur lire(Joueur unJoueur) throws DAOException {
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT pseudo FROM Joueur WHERE pseudo = ?");
            stmt.setString(1, unJoueur.getPseudo());
            ResultSet rs = stmt.executeQuery();

            Joueur joueur=null;
            if(rs.next()){
                unJoueur=new Joueur(unJoueur.getPseudo());
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
    public boolean créer(Joueur joueur) throws DAOException {
        boolean executé=false;
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Joueur VALUES (?)");
            stmt.setString(1, joueur.getPseudo());
            executé=stmt.execute();

            conn.close();

        }
        catch(SQLException e){
            throw new DAOException(e);
        }
        return executé;

    }

    /**
     * Modifie un objet dans la source de données
     *
     * @param joueur l'objet à modifier dans la source de données
     * @return le joueur tel qu'il a été modifié dans la source de données null si non trouve
     */
    @Override
    public Joueur modifier(Joueur joueur) throws DAOException {
        /**
         *
         *      LA TABLE NE POSSEDE QUE SA CLE PRIMAIRE DONC NE PEUT ETRE MODIFIEE
         *
         * Joueur unJoueur=null;
         try{
         Connection conn=SQLConnectionFactory.getConnection();

         PreparedStatement stmt = conn.prepareStatement("UPDATE Joueur SET xxxxx WHERE pseudo=?");
         stmt.setString(1, joueur.getPseudo());
         stmt.execute();



         unJoueur=lire(joueur.getPseudo());

         conn.close();

         }
         catch(SQLException e){
         throw new DAOException(e);
         }
         return unJoueur;

         */
        return null;

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
            PartieDAO partieDAO=new PartieDAO();
            //partieDAO.supprimer(new Partie(1,new Joueur(""),new Joueur(""), ""));
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
    @Override
    public ArrayList<Joueur> chercherTous() throws DAOException{
        ArrayList<Joueur> joueurs= new ArrayList<Joueur>();
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT *FROM Joueur");
            ResultSet rs=stmt.executeQuery();

            while(rs.next()){
                joueurs.add(new Joueur(rs.getString("pseudo")));
            }
            conn.close();

        }
        catch(SQLException e){
            throw new DAOException(e);
        }
        return joueurs;
    }
}
