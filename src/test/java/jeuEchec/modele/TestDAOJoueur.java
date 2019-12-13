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
}
