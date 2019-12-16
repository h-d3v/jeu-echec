package jeuEchec.modele;

import java.util.ArrayList;

public class Reine extends Piece {
    /**
     * Constructeur
     *

     * @param uneCouleur
     */
    Reine(Couleur uneCouleur) {
        super(uneCouleur);
    }

    /**
     * Methode qui retourne les coordonnees valides d'une piece pour son prochain mouvement
     *
     * @return ArrayList<int [ ]>
     */
    @Override
    public ArrayList<int[]> mouvements() {
        return null;
    }

    /**
     * Methode qui retourne les coordonnees valides d'une piece pour son prochain mouvement
     *
     * @param unEchiquier
     * @return ArrayList<int [ ]>
     */
    @Override
    public ArrayList<int[]> mouvements(Echiquier unEchiquier) {
        return null;
    }
}
