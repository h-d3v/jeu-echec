package jeuEchec.modele;

import java.util.ArrayList;

public class Cavalier extends Piece {

    /**
     * Constructeur
     *
     * @param uneCoordoneeX
     * @param uneCoordonneeY
     * @param uneCouleur
     */
    public Cavalier(int uneCoordoneeX, int uneCoordonneeY, Couleur uneCouleur){
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

    @Override
    public String toString() {
        if (this.getcouleur().equals(Couleur.BLANC)){
            return "\u2658";
        }else{
            return "\u265E";
        }

    }
}
