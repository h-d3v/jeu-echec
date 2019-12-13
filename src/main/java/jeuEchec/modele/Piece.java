package jeuEchec.modele;

import java.util.ArrayList;

public abstract class Piece {
    int x;
    int y;
    boolean estPris;
    Couleur uneCouleur;


    /**
     * Constructeur
     * @param uneCoordoneeX
     * @param uneCoordonneeY
     * @param uneCouleur
     */
    Piece(int uneCoordoneeX, int uneCoordonneeY, Couleur uneCouleur){
        assert uneCoordoneeX>=0;
        assert uneCoordonneeY>=0;
        assert uneCoordoneeX<=7;
        assert uneCoordonneeY<=7;
        x=uneCoordoneeX;
        y=uneCoordonneeY;
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
     *
     * Accesseur de l'attribut x
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Accesseur de l'attribut y
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * Accesseur de l'attribut uneCouleur
     * @return uneCouleur
     */
    public Couleur getcouleur() {
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
     * Mutateur de l'attribut x
     * @param x
     */
    public void setX(int x) {
        assert x>=0;
        assert x<=7;
        this.x = x;
    }

    /**
     * Mutateur de l'attribut y
     * @param y
     */
    public void setY(int y) {
        assert y>=0;
        assert y<=7;
        this.y = y;
    }

    /**
     * Mutateur de l'attribut x et y
     * @param x
     * @param y
     */

    public void setCoordonees(int x, int y){
        assert x>=0;
        assert y>=0;
        assert x<=7;
        assert y<=7;
        this.x = x;
        this.y = y;
    }
    public int[] getCoordonnees(){
        int[] tab=new int[2];
        tab[0]=x;
        tab[1]=y;
        return tab;
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
