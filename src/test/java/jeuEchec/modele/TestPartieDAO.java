package jeuEchec.modele;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPartieDAO {
    @Test
    public void testerlirePartie() throws DAOException{
        Partie partie=new Partie(new Joueur("S"), new Joueur("D"));
        PartieDAO partieDAO=new PartieDAO();
        assertEquals(partie, partieDAO.lire(partie).getMouvements());
    }

    @Test
    public void testerAjouterPartie()throws DAOException{
        Partie partie=new Partie(new Joueur("S"), new Joueur("D"));
        PartieDAO partieDAO=new PartieDAO();
        assertEquals(true, partieDAO.créer(partie));
    }
}
