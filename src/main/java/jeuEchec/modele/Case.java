package jeuEchec.modele;

public class Case {
    private int y;
    private int x;
    private Piece piece;

    /**
     * Constructeur de la case
     * @param x
     * @param y
     */
   public Case(int x, int y){
        this.x=x;
        this.y=y;
        piece=null;
    }

    /**
     *
     * @return x de la case
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @return y de la case
     */
    public int getY() {
        return y;
    }

    public void setPiece(Piece piece) {
        assert piece!=null;
        this.piece = piece;
    }



}
