package jeuEchec.modele;

import java.util.ArrayList;

public class Pion extends Piece {
    boolean premierMouvement;
    /**
     * Constructeur
     *
     * @param uneCoordoneeX
     * @param uneCoordonneeY
     * @param uneCouleur
     */
    Pion(int uneCoordoneeX, int uneCoordonneeY, Couleur uneCouleur) {
        super(uneCoordoneeX, uneCoordonneeY, uneCouleur);
        premierMouvement=true;
    }

    /**
     * Accesseur du premier mouvement
     *
     * @return premierMouvement
     */
    public boolean EstPremierMouvement() {
        return premierMouvement;
    }

    /**
     * Mutateur du premier mouvement
     * met le premier mouvement a false
     */

    public void setPremierMouvement() {
        this.premierMouvement = false;
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
