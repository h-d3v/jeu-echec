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
     * @return la piece de la case
     */
    public Piece getPiece() {
        return piece;
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

    /**
     * Set la piece de la case
     * @param piece la piece a mettre dans la case
     */
    public void setPiece(Piece piece) {
        assert piece!=null;
        this.piece = piece;
    }



}
