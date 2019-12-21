package jeuEchec.modele;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestReine{

        @Test
        public void testReineBlanc(){
            Reine reineTest = new Reine (0,2,Couleur.BLANC);
            assertEquals(reineTest.toString(),"\u2655");

        }

        @Test
        public void testReineNoir(){
            Reine reineTest = new Reine (0,2,Couleur.NOIR);
            assertEquals(reineTest.toString(),"\u265B");
        }


}

