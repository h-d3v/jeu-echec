package jeuEchec.modele;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDAOJoueur {

    @Test
    public void testerlireJoueurDao() throws DAOException{
        Joueur joueur=new Joueur("Sin-Deny Thorpe");
        JoueurDAO joueurDAO=new JoueurDAO();
        assertEquals(joueur.getPseudo(), joueurDAO.lire("Sin-Deny Thorpe").getPseudo() );
    }

    @Test
    public void testerAjouterJoueur()throws DAOException{
        Joueur joueur=new Joueur("Je suis un nouveau joueur");
        JoueurDAO joueurDAO=new JoueurDAO();
        assertEquals(joueur.getPseudo(), joueurDAO.créer(joueur).getPseudo());
    }
    @Test
    public void testerRetirerJoueur()throws DAOException{
        Joueur joueur=new Joueur("Sin-Deny Thorpe");
        JoueurDAO joueurDAO=new JoueurDAO();
        assertEquals(joueur.getPseudo(), joueurDAO.supprimer(joueur).getPseudo());
    }

    @Test
    public void testChercherTous() throws DAOException{
        Joueur joueur1=new Joueur("Maolcholuim Mac Shitrig");
        Joueur joueur2=new Joueur("Sin-Deny Thorpe");
        JoueurDAO joueurDAO=new JoueurDAO();
        assertEquals(2, joueurDAO.chercherTous().size());

    }
}
