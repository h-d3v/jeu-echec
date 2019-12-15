package jeuEchec.modele;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PartieDAO extends DAO<Partie> {
    /**
     * Lit un objet à partir de son id
     *
     * @param id L'identifiant unique de l'objet à lire
     * @return l'objet lu ou null si l'objet n'a pu être lu
     */
    @Override
    public Partie lire(Object id) throws DAOException {
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT id, pseudoJoueurBlancs, pseudoJoueurNoirs, mouvements, estTerminee, temps, vainqueur  FROM Partie WHERE id = ?");
            stmt.setString(1, (String)id);
            ResultSet rs = stmt.executeQuery();

            Partie partie=null;
            if(rs.next()){
                partie=new Partie((String)id);
            }

            rs.close();
            conn.close();
            return unJoueur;
        }
        catch(SQLException e){
            throw new DAOException(e);
        }    }

    /**
     * Crée un nouvel objet
     *
     * @param objet l'objet à ajouter dans la source de données
     * @return l'objet tel qu'il a été créé dans la source de données
     */
    @Override
    public Partie créer(Partie objet) throws DAOException {
        return null;
    }

    /**
     * Modifie un objet dans la source de données
     *
     * @param objet l'objet à modifier dans la source de données
     * @return l'objet tel qu'il a été modifié dans la source de données
     */
    @Override
    public Partie modifier(Partie objet) throws DAOException {
        return null;
    }

    /**
     * Supprime un objet de la source de données
     *
     * @param objet l'objet à supprimer de la source de données
     * @return l'objet supprimé ou null s'il n'a pas été trouvé
     */
    @Override
    public Partie supprimer(Partie objet) throws DAOException {
        return null;
    }
}
