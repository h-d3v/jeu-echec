package jeuEchec.modele;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testTour {
    @Test
    public void testToStringTourBlanc(){
        Tour tour =new Tour(0,2,Couleur.NOIR);
        assertEquals(tour.toString(),"\u2656");
    }
    @Test
    public void testToStringTourNoir(){
        Tour tour =new Tour(0,2,Couleur.NOIR);
        assertEquals(tour.toString(),"\u265C");
    }
}
