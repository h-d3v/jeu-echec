package jeuEchec.modele;

import com.google.common.base.Stopwatch;

;



public class Partie {
    private Echiquier echiquier;
    private int idPartie;
    private Joueur joueurBlanc;
    private Joueur joueurNoir;
    private boolean estTerminee;
    private Stopwatch temps;
    private Joueur tourJoueur;
    private Joueur joueurGagant;
    private static int compteur=1;
    private String mouvements;

    /**
     * Constructeur d'une partie
     * @param joueurBlanc
     * @param  joueurNoir
     */
    Partie(Joueur joueurBlanc, Joueur joueurNoir){
        idPartie=compteur;
        compteur++;
        this.joueurBlanc=joueurBlanc;
        this.joueurNoir=joueurNoir;
    }

    /**
     * Constructeur d'une partie sauvegardee
     * @param id
     * @param joueurBlanc
     * @param joueurNoir
     * @param  mouvements String
     *
     *
     */
    Partie(Integer id, Joueur joueurBlanc, Joueur joueurNoir, String mouvements){
        this.idPartie=id;
        this.joueurNoir=joueurNoir;
        this.joueurBlanc=joueurBlanc;
        this.mouvements=mouvements;
    }

    /**
     *
     * @return echiquier Echiquier
     */
    public Echiquier getEchiquier() {
        return echiquier;
    }

    /**
     *
     * @return idPartie int
     */
    public int getIdPartie() {
        return idPartie;
    }

    /**
     *
     * @return joueurBlanc Joueur
     */
    public Joueur getJoueurBlanc() {
        return joueurBlanc;
    }

    /**
     *
     *
     * @return joueurGagant Joueur
     */
    public Joueur getJoueurGagant() {
        return joueurGagant;
    }

    /**
     *
     * @return joueurNoir Joueur
     */
    public Joueur getJoueurNoir() {
        return joueurNoir;
    }

    /**
     *
     * @return tourJoueur Joueur
     */
    public Joueur getTourJoueur() {
        return tourJoueur;
    }

    /**
     *
     * @return temps Stopwatch
     */
    public Stopwatch getTemps() {
        return temps;
    }

    /**
     *
     * @return mouvements String la representation en texte des mouvements sur l'echiquier
     */
    public String getMouvements() {
        return mouvements;
    }

    /**
     *
     * @return estTerminee boolean
     */
    public boolean estTerminee() {
        return estTerminee;
    }

    /**
     *
     * @param echiquier
     */
    public void setEchiquier(Echiquier echiquier) {
        this.echiquier = echiquier;
    }

    /**
     *
     * @param estTerminee
     */
    public void setEstTerminee(boolean estTerminee) {
        this.estTerminee = estTerminee;
    }

    /**
     *
     * @param idPartie
     */
    public void setIdPartie(int idPartie) {
        this.idPartie = idPartie;
    }

    /**
     *
     * @param joueurBlanc
     */
    public void setJoueurBlanc(Joueur joueurBlanc) {
        this.joueurBlanc = joueurBlanc;
    }

    /**
     *
     * @param joueurGagant
     */
    public void setJoueurGagant(Joueur joueurGagant) {
        this.joueurGagant = joueurGagant;
    }

    /**
     *
     * @param joueurNoir
     */
    public void setJoueurNoir(Joueur joueurNoir) {
        this.joueurNoir = joueurNoir;
    }

    /**
     *
     * @param mouvements
     */
    public void setMouvements(String mouvements) {
        this.mouvements = mouvements;
    }

}
