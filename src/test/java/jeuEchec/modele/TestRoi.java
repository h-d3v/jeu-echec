package jeuEchec.modele;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRoi {
    @Test
    public void testRoiBlanc(){
        Roi roiTest = new Roi (0,2,Couleur.BLANC);
        assertEquals(roiTest.toString(),"\u2654");

    }

    @Test
    public void testReineNoir(){
        Roi roiTest = new Roi (0,2,Couleur.NOIR);
        assertEquals(roiTest.toString(),"\u265A");
    }
}
