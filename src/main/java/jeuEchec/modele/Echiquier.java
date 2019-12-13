package jeuEchec.modele;

import java.util.ArrayList;

public class Echiquier {
   private ArrayList<Piece> piecesBlanches;
   private ArrayList<Piece> piecesNoires;

    /**
     * constructeur, initialise toutes les pieces du jeu
     * et les ajoutes a  la liste  des pieces blanches et noires du jeu.
     */
   Echiquier(){
       piecesBlanches= new ArrayList<Piece>();
       //Cr/ation et ajout de 7 pions blancs
       for (int i = 0; i <8 ; i++) {
           Pion pion= new Pion(i, 1,Couleur.BLANC);
           piecesBlanches.add(pion) ;
       }
       //Creation et ajout des 7 pieces speciale du jeu
       Tour tourB1= new Tour(0,1,Couleur.BLANC);
       Cavalier cavalierB1= new Cavalier(1,1, Couleur.BLANC);
       Fou fouB1= new Fou(2, 1, Couleur.BLANC);
       Reine reineB= new Reine(3,1, Couleur.BLANC);
       Roi roiB= new Roi(4, 1, Couleur.BLANC);
       Fou fouB2= new Fou(5, 1, Couleur.BLANC);
       Cavalier cavalierB2= new Cavalier(6,1, Couleur.BLANC);
       Tour tourB2= new Tour(7,1,Couleur.BLANC);
       piecesBlanches.add(tourB1);
       piecesBlanches.add(cavalierB1);
       piecesBlanches.add(fouB1);
       piecesBlanches.add(reineB);
       piecesBlanches.add(roiB);
       piecesBlanches.add(fouB2);
       piecesBlanches.add(cavalierB2);
       piecesBlanches.add(tourB2);

       piecesNoires= new ArrayList<Piece>();
       //Cr/ation et ajout de 7 pions blancs
       for (int i = 0; i <8 ; i++) {
           Pion pion= new Pion(i, 6,Couleur.NOIR);
           piecesNoires.add(pion) ;
       }
       //Creation et ajout des 7 pieces speciale du jeu
       Tour tourN1= new Tour(0,6,Couleur.NOIR);
       Cavalier cavalierN1= new Cavalier(1,6, Couleur.NOIR);
       Fou fouN1= new Fou(2, 6, Couleur.NOIR);
       Reine reineN= new Reine(3,6, Couleur.NOIR);
       Roi roiN= new Roi(4, 6, Couleur.NOIR);
       Fou fouN2= new Fou(5, 6, Couleur.NOIR);
       Cavalier cavalierN2= new Cavalier(6,6, Couleur.NOIR);
       Tour tourN2= new Tour(7,6,Couleur.NOIR);
       piecesBlanches.add(tourN1);
       piecesBlanches.add(cavalierN1);
       piecesBlanches.add(fouN1);
       piecesBlanches.add(reineN);
       piecesBlanches.add(roiN);
       piecesBlanches.add(fouN2);
       piecesBlanches.add(cavalierN2);
       piecesBlanches.add(tourN2);
   }

    /**
     *
     * @return ArrayList<Piece> piecesBlanches
     */
    public ArrayList<Piece> getPiecesBlanches(){
        return piecesBlanches;
    }

    /**
     *
     * @return piecesNoires
     */
    public ArrayList<Piece> getPiecesNoires(){
        return piecesNoires;
    }

    /**
     *
     * @param piecesBlanches nouvelle liste de pieces blanches
     */
    public void setPiecesBlanches(ArrayList<Piece> piecesBlanches){
    }

    /**
     *
     * @param piecesNoires nouvelle liste de pieces noires
     */
    public void setPiecesNoires(ArrayList<Piece> piecesNoires) {
        this.piecesNoires = piecesNoires;
    }
}
