package jeuEchec.modele;



public class Echiquier {
    private Piece[] pieces=new Piece[32];

    public Echiquier(){
        // Initialisation des cases de l'echequier
        //  et creation des pions + ajout a leur case respectives

        //Pions noirs
        int j=0;
        for (int i = 0; i <8 ; i++) {
            pieces[i]=new Pion(1,i, Couleur.NOIR);
        }
        pieces[8]= new Tour(0,0,Couleur.NOIR);
        pieces[9]=new Tour(0,7,Couleur.NOIR);
        pieces[10]= new Cavalier(0,1,Couleur.NOIR);
        pieces[11]=new Cavalier(0,6,Couleur.NOIR);
        pieces[12]= new Fou(0,2,Couleur.NOIR);
        pieces[13]=new Cavalier(0,5,Couleur.NOIR);
        pieces[14]=new Reine(0,3,Couleur.NOIR);
        pieces[15]=new Roi(0,4,Couleur.NOIR);

        //Pions blancs
        for (int i = 16; i <24 ; i++) {
            pieces[i]=new Pion(6, j, Couleur.BLANC);
            j++;
        }
        pieces[24]= new Tour(7,0,Couleur.BLANC);
        pieces[25]=new Tour(7,7,Couleur.BLANC);
        pieces[26]= new Cavalier(7,1,Couleur.BLANC);
        pieces[27]=new Cavalier(7,6,Couleur.BLANC);
        pieces[28]= new Fou(7,2,Couleur.BLANC);
        pieces[29]=new Cavalier(7,5,Couleur.BLANC);
        pieces[30]=new Reine(7,3,Couleur.BLANC);
        pieces[31]=new Roi(7,4,Couleur.BLANC);


    }

    /**
     *
     * @return pieces les pieces de la partie
     */
    public Piece[] getPieces() {
        return pieces;
    }

    public Piece getPieceParCoordonnees(String unCoordonnne){
        Piece pieceCherchee=null;
        for(Piece piece : pieces){
            if(piece.getCoordonneesEnString().equals(unCoordonnne)){
                pieceCherchee=piece;
                break;
            }
        }

        return pieceCherchee;
    }


    /**
     *
     * @param x coordonnee longitude
     * @param y coordonnee latitude
     * @return la piece, null si pas de piece a cette coordonnee
     */

    public Piece getPieceParCoordonnees(int x, int y){
        Piece piece=null;
        for(Piece unePiece : pieces){
            if(x ==unePiece.getX() && y==unePiece.getY()){
                piece=unePiece;
                break;
            }
        }
        return piece;
    }


    /**
     *
     * @param piece la piece de depart
     * @param xDestination la longitude de la case de destination
     * @param yDestination la latitude de la case de destination
     * @return boolean
     */

    public boolean jouerCoup(Piece piece, int xDestination, int yDestination){
        assert piece!=null;
        assert (xDestination<=7 && xDestination>0);
        assert (yDestination<=7 && yDestination>0);
        boolean valide=false;
        Couleur couleurPiece=piece.getcouleur();
        Piece pieceDestination=getPieceParCoordonnees(xDestination, yDestination);

        if(pieceDestination!=null && !pieceDestination.getcouleur().equals(couleurPiece)){
            System.out.println("piece destination avant delete");
            pieceDestination=null;
            piece.setCoordonees(xDestination,yDestination);


        }

        else if(pieceDestination!=null && pieceDestination.getcouleur().equals(couleurPiece)) {

        }

        else{
            piece.setCoordonees(xDestination,yDestination);
            valide=true;
        }
        return valide;
    }


}
