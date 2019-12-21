package jeuEchec.modele;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFou {
    @Test
    public void testRoiBlanc(){
        Fou fouTest = new Fou (0,2,Couleur.BLANC);
        assertEquals(fouTest.toString(),"\u2657");

    }

    @Test
    public void testReineNoir(){
        Fou fouTest = new Fou (0,2,Couleur.NOIR);
        assertEquals(fouTest.toString(),"\u265D");
    }
}
