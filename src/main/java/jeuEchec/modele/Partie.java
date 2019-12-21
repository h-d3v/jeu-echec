package jeuEchec.modele;

import com.google.common.base.Stopwatch;



public class Partie {
    private Echiquier echiquier;
    private int idPartie;
    private Joueur joueurBlanc;
    private Joueur joueurNoir;
    private boolean estTerminee;
    protected Stopwatch tempsPartie;
    private Joueur tourJoueur;
    private Joueur joueurGagant;
    private static int compteur=1;
    private String mouvements;

    /**
     * Constructeur d'une nouvelle partie
     * @param joueurBlanc joueur qui a la couleur
     * @param  joueurNoir joueur
     */
    public Partie(Joueur joueurBlanc, Joueur joueurNoir){
        assert joueurBlanc!=null;
        assert joueurNoir!=null;
        idPartie=compteur;
        compteur++;
        tempsPartie=Stopwatch.createStarted();
        this.joueurBlanc=joueurBlanc;
        this.joueurNoir=joueurNoir;
        this.echiquier=new Echiquier();
        tourJoueur=joueurBlanc;
        mouvements="";
    }


    /**
     * Constructeur d'une partie sauvegardee
     * @param id int id de la partie
     * @param joueurBlanc Joueur
     * @param joueurNoir Joueur
     * @param  mouvements String
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
    public Joueur getJoueurGagnant() {
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
        return tempsPartie;
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
     * @param estTerminee
     */


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
     * @param joueurGagant le joueur qui a gagné
     */
    public void setJoueurGagant(Joueur joueurGagant) {
        this.joueurGagant = joueurGagant;
    }

    /**
     *
     * @param joueurNoir le joueur ayant les pions noirs
     */
    public void setJoueurNoir(Joueur joueurNoir) {
        this.joueurNoir = joueurNoir;
    }

    /**
     *
     * @param mouvements les mouvements de la partie
     */
    public void setMouvements(String mouvements) {
        this.mouvements = mouvements;
    }

    /**
     * termine la partie passer en parametre
     * @param joueurGagant le joueur gagnant
     */
    public void terminerPartie(Joueur joueurGagant){
            assert(!this.estTerminee());
            assert(joueurGagant!=null);
            this.estTerminee = estTerminee;
            this.joueurGagant=joueurGagant;
            tempsPartie.stop();
        }
    }

