package jeuEchec.modele;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDAOJoueur {

    @Test
    public void testerlireJoueurDao() throws DAOException{
        Joueur joueur=new Joueur("Sin-Deny Thorpe");
        JoueurDAO joueurDAO=new JoueurDAO();
        assertEquals(joueur.getPseudo(), joueurDAO.lire(joueur).
                getPseudo() );
    }

    @Test
    public void testerAjouterJoueur()throws DAOException{
        Joueur joueur=new Joueur("Je suis un nouveau joueur");
        JoueurDAO joueurDAO=new JoueurDAO();
        assertEquals(true, joueurDAO.créer(joueur));
    }
    @Test
    public void testerRetirerJoueur()throws DAOException{
        Joueur joueur=new Joueur("Je suis un nouveau joueur");
        JoueurDAO joueurDAO=new JoueurDAO();
        assertEquals(joueur.getPseudo(), joueurDAO.supprimer(joueur).getPseudo());


    }

    @Test
    public void testChercherTous() throws DAOException{
        Joueur joueur1=new Joueur("Maolcholuim Mac Shitrig");
        Joueur joueur2=new Joueur("Sin-Deny Thorpe");
        Joueur joueur3=new Joueur("Je suis un nouveau joueur");
        JoueurDAO joueurDAO=new JoueurDAO();
        assertEquals(3, joueurDAO.chercherTous().size());
        assertEquals(joueur1.getPseudo(), joueurDAO.chercherTous().get(0).getPseudo() );
        assertEquals(joueur2.getPseudo(), joueurDAO.chercherTous().get(1).getPseudo() );
        assertEquals(joueur3.getPseudo(), joueurDAO.chercherTous().get(2).getPseudo() );

    }
}
