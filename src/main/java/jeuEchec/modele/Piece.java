package jeuEchec.modele;

import java.util.ArrayList;

public abstract class Piece {
    boolean estPris;
    Couleur uneCouleur;


    /**
     * Constructeur
     * @param uneCouleur couleur de la piece
     */
    Piece(Couleur uneCouleur){
        estPris=false;
        this.uneCouleur=uneCouleur;
    }

    /**
     * Accesseur de l'attribut estPris
     * @return estPris
     */
    public boolean estPris() {
        return estPris;
    }




    /**
     * Accesseur de l'attribut uneCouleur
     * @return uneCouleur
     */
    public Couleur getCouleur() {
        return uneCouleur;
    }

    /**
     * Mutateur de l'attribut uneCouleur
     * @param uneCouleur
     */
    public void setUneCouleur(Couleur uneCouleur) {
        this.uneCouleur = uneCouleur;
    }

    /**
     * Mutateur de l'attribut est pris
     * @param estPris
     */
    public void setEstPris(boolean estPris) {
        this.estPris = estPris;
    }



    /**
     * Methode qui retourne les coordonnees valides d'une piece pour son prochain mouvement
     * @return ArrayList<int[]>
     */
    public abstract ArrayList<int[]> mouvements();

    /**
     * Methode qui retourne les coordonnees valides d'une piece pour son prochain mouvement
     * @return ArrayList<int[]>
     */
    public abstract ArrayList<int[]> mouvements(Echiquier unEchiquier);
}
