package jeuEchec.modele;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

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

            PreparedStatement stmt = conn.prepareStatement("SELECT id, pseudoJoueurBlancs, pseudoJoueurNoirs, mouvements, estTerminee, temps, vainqueur FROM Partie WHERE id = ?");
            stmt.setInt(1, (Integer) id);
            ResultSet rs = stmt.executeQuery();

            Partie partie=null;
            if(rs.next()){
                JoueurDAO joueurDAO=new JoueurDAO();
                partie=new Partie((Integer)id, joueurDAO.lire(rs.getString("pseudoJoueurBlancs")), joueurDAO.lire(rs.getString("pseudoJoueurNoirs")), rs.getString("mouvements"));
            }

            rs.close();
            conn.close();
            return partie;
        }
        catch(SQLException e){
            throw new DAOException(e);
        }

    }

    /**
     * Crée un nouvel objet
     *
     * @param objet l'objet à ajouter dans la source de données
     * @return l'objet tel qu'il a été créé dans la source de données
     */
    @Override
    public Partie créer(Partie objet) throws DAOException {
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Partie(id, pseudoJoueurBlancs, pseudoJoueurNoirs, mouvements) VALUES (?,?,?,?)");
            stmt.setInt(1, objet.getIdPartie());
            stmt.setString(2,objet.getJoueurBlanc().getPseudo());
            stmt.setString(3, objet.getJoueurNoir().getPseudo());
            stmt.setString(4, objet.getMouvements());
            stmt.execute();
            Partie  partie=lire(objet.getIdPartie());
            return partie;

        }
        catch(SQLException e){
            throw new DAOException(e);
        }
    }

    /**
     * Modifie un objet dans la source de données
     *
     * @param objet l'objet à modifier dans la source de données
     * @return l'objet tel qu'il a été modifié dans la source de données
     */
    @Override
    public Partie modifier(Partie objet) throws DAOException {
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("UPDATE Partie SET pseudoJoueurBlancs=?, pseudoJoueurNoirs=?, mouvements=? WHERE id=?");
            stmt.setInt(4, objet.getIdPartie());
            stmt.setString(1,objet.getJoueurBlanc().getPseudo());
            stmt.setString(2, objet.getJoueurNoir().getPseudo());
            stmt.setString(3, objet.getMouvements());
            stmt.execute();
            Partie partie=lire(objet.getIdPartie());
            return partie;

        }
        catch(SQLException e){
            throw new DAOException(e);
        }
    }

    /**
     * Supprime un objet de la source de données
     *
     * @param objet l'objet à supprimer de la source de données
     * @return l'objet supprimé ou null s'il n'a pas été trouvé
     */
    @Override
    public Partie supprimer(Partie objet) throws DAOException {
        Partie partie=null;

        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Partie WHERE id=?");
            stmt.setInt(1, objet.getIdPartie());
            stmt.execute();

            partie=objet;

            conn.close();

        }
        catch(SQLException e){
            throw new DAOException(e);
        }
        return partie;
    }

    /**
     *
     * @return parties ArrayList<Parties>
     * @throws DAOException
     */
    @Override
    public ArrayList<Partie> chercherTous() throws DAOException {
        ArrayList<Partie> parties=null;
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT id, pseudoJoueurBlancs, pseudoJoueurNoirs, mouvements/*, estTerminee, temps, vainqueur */ FROM Partie ");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                JoueurDAO joueurDAO=new JoueurDAO();
                parties.add(new Partie(rs.getInt("id"), joueurDAO.lire(rs.getString("pseudoJoueurBlancs")), joueurDAO.lire(rs.getString("pseudoJoueurNoirs")), rs.getString("mouvements")));
            }

            rs.close();
            conn.close();
            return parties;
        }
        catch(SQLException e){
            throw new DAOException(e);
        }
    }

    /**
     *
     * @param unJoueur Joueur
     * @return parties ArrayLsit<Partie> les parties d'un joueur
     * @throws DAOException
     */
    public ArrayList<Partie> chercherParJoueur(Joueur unJoueur) throws DAOException{
        ArrayList<Partie> parties=null;
        try{
            Connection conn=SQLConnectionFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT id, pseudoJoueurBlancs, pseudoJoueurNoirs, mouvements/*, estTerminee, temps, vainqueur */ FROM Partie WHERE pseudoJoueurBlancs=? OR pseudoJoueurNoirs=?");
            stmt.setString(1,unJoueur.getPseudo());
            stmt.setString(2,unJoueur.getPseudo());
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                JoueurDAO joueurDAO=new JoueurDAO();
                parties.add(new Partie(rs.getInt("id"), joueurDAO.lire(rs.getString("pseudoJoueurBlancs")), joueurDAO.lire(rs.getString("pseudoJoueurNoirs")), rs.getString("mouvements")));
            }

            rs.close();
            conn.close();
            return parties;
        }
        catch(SQLException e){
            throw new DAOException(e);
        }
    }
}
