package jeuEchec.modele;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testPion {
    @Test
    public void testToStringPionBlanc(){
        Pion pion =new Pion(0,2,Couleur.BLANC);
        assertEquals(pion.toString(),"\u2659");

    }
    @Test
    public void testToStringPionNoir(){
        Pion pion =new Pion(0,2,Couleur.NOIR);
        assertEquals(pion.toString(),"\u265F");

    }
}
