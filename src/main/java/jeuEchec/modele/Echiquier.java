package jeuEchec.modele;



public class Echiquier {
   protected Case[][]  cases;
    /**
     * constructeur d'un nouveau echiquier
     */
   Echiquier(){
       // Initialisation des cases de l'echequier
       //  et creation des pions + ajout a leur case respectives
       cases=new Case[8][8];
       for (int i = 0; i <8 ; i++) {
           for (int j = 0; j < 8; j++) {

               cases[i][j] = new Case(i, j);
           }
           Pion pionB = new Pion(Couleur.BLANC);
           Pion pionN = new Pion(Couleur.NOIR);
           cases[i][1].setPiece(pionB);
           cases[i][6].setPiece(pionN);
       }
       //Creation des pieces speciales blanches
       Tour tourB1= new Tour(Couleur.BLANC);
       Cavalier cavalierB1= new Cavalier(Couleur.BLANC);
       Fou fouB1= new Fou(Couleur.BLANC);
       Reine reineB= new Reine(Couleur.BLANC);
       Roi roiB= new Roi( Couleur.BLANC);
       Fou fouB2= new Fou(Couleur.BLANC);
       Cavalier cavalierB2= new Cavalier(Couleur.BLANC);
       Tour tourB2= new Tour(Couleur.BLANC);

       //Creation des pieces speciales noires
       Tour tourN1= new Tour(Couleur.NOIR);
       Cavalier cavalierN1= new Cavalier(Couleur.NOIR);
       Fou fouN1= new Fou(Couleur.NOIR);
       Reine reineN= new Reine(Couleur.NOIR);
       Roi roiN= new Roi( Couleur.NOIR);
       Fou fouN2= new Fou(Couleur.NOIR);
       Cavalier cavalierN2= new Cavalier(Couleur.NOIR);
       Tour tourN2= new Tour(Couleur.NOIR);

       //ajout des pieces dans les cases de l'echequier
       cases[0][0].setPiece(tourB1);
       cases[1][0].setPiece(cavalierB1);
       cases[2][0].setPiece(fouB1);
       cases[3][0].setPiece(reineB);
       cases[4][0].setPiece(roiB);
       cases[5][0].setPiece(fouB2);
       cases[6][0].setPiece(cavalierB2);
       cases[7][0].setPiece(tourB2);
       cases[0][7].setPiece(tourN1);
       cases[1][7].setPiece(cavalierN1);
       cases[2][7].setPiece(fouN1);
       cases[3][7].setPiece(reineN);
       cases[4][7].setPiece(roiN);
       cases[5][7].setPiece(fouN2);
       cases[6][7].setPiece(cavalierN2);
       cases[7][7].setPiece(tourN2);
   }

    /**
     *
     * @return un tableau de toutes les Cases du jeu
     */
    public Case[][] getCases() {
        return cases;
    }

    /**
     * joue un coup sur l'echequier,
     * fait deplacer la piece choisie dans la case de
     * destination enleve la piece
     * @param piece piece a deplacer
     * @param xDestination destination x
     * @param yDestination destination y
     */
        public void jouerCoup(Piece piece, int xDestination, int yDestination){
            assert piece!=null;
            assert (xDestination<=7 && xDestination>0);
            assert (yDestination<=7 && yDestination>0);
            Couleur couleurPiece=piece.getCouleur();
            assert(cases[xDestination][yDestination].getPiece().getCouleur()!=couleurPiece);
            cases[xDestination][yDestination].setPiece(piece);
    }
}
