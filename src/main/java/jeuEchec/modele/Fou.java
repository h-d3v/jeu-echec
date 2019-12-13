package jeuEchec.modele;

import java.util.ArrayList;

public class Fou extends Piece {

    /**
     * Constructeur
     *
     * @param uneCoordoneeX
     * @param uneCoordonneeY
     * @param uneCouleur
     */
    Fou(int uneCoordoneeX, int uneCoordonneeY, Couleur uneCouleur) {
        super(uneCoordoneeX, uneCoordonneeY, uneCouleur);
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