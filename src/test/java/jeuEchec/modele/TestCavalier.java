package jeuEchec.modele;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCavalier {
    @Test
    public void testToStringCavalierBlanc(){
        Cavalier cavalier =new Cavalier(0,2,Couleur.BLANC);
        assertEquals(cavalier.toString(),"\u2658");

    }
    @Test
    public void testToStringCavalierNoir(){
        Cavalier cavalier =new Cavalier(0,2,Couleur.NOIR);
        assertEquals(cavalier.toString(),"\u265E");

    }
}
