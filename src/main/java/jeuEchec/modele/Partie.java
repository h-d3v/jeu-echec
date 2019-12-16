package jeuEchec.modele;

import com.google.common.base.Stopwatch;
import javafx.scene.paint.Stop;

import java.util.Objects;



public class Partie {
    public enum StatutPartie {
        ENCOURS,
        PAUSE,
        TERMINEE
    }

    private int idPartie;
    private Joueur joueurBlanc;
    private Joueur joueurNoir;
    private Stopwatch tempsPartie= Stopwatch.createUnstarted();
    private Joueur tourJoueur;
    private Joueur joueurGagant;
    private static int compteur=1;
    private Echiquier echequier;
    private StatutPartie statut;
    /**
     * Constructeur d'une nouvelle partie
     * @param joueurBlanc joueur qui a la couleur
     * @param  joueurNoir joueur
     */
    Partie(Joueur joueurBlanc, Joueur joueurNoir){
        assert joueurBlanc!=null;
        assert joueurNoir!=null;
        idPartie=compteur;
        compteur++;
        statut=StatutPartie.ENCOURS;
        this.joueurBlanc=joueurBlanc;
        this.joueurNoir=joueurNoir;
        echequier=new Echiquier();
        tempsPartie.start();
        tourJoueur=joueurBlanc;
    }
 //Accesseurs et mutateurs
    /**
     *
     * @return le statut de la partie
     */
    public StatutPartie getStatut() {
        return statut;
    }

    /**
     *
     * @return le joueur gagnnant de la partie
     */
    public Joueur getJoueurGagant() {
        return joueurGagant;
    }

    /**
     *
     * @return le tour du joueur
     */
    public Joueur getTourJoueur() {
        return tourJoueur;
    }

    /**
     *
     * @return joueur blanc de la partie
     */
    public Joueur getJoueurBlanc() {
        return joueurBlanc;
    }

    /**
     *
     * @return le chrono de la partie
     */
    public Stopwatch getTempsPartie() {
        return tempsPartie;
    }

    /**
     *
     * @return joueur noir de la partie
     */
    public Joueur getJoueurNoir() {
        return joueurNoir;
    }

    /**
     *
     * @return echequier de la partie
     */
    public Echiquier getEchequier() {
        return echequier;
    }

    /**
     * @return l'id de la partie
     */
    public int getIdPartie() {
        return idPartie;
    }

    /**
     * @param joueurGagant le joueur ayant gagné la partie
     */
    public void setJoueurGagant(Joueur joueurGagant) {
        this.joueurGagant = joueurGagant;
    }


    public void setStatut(StatutPartie statut) {
        assert(statut!=null);
        this.statut = statut;
    }

    /**
     *
     * @param unJoueur le joueur auquel il est au tour de joué
     */
    public void setTourJoueur(Joueur unJoueur) {
        assert(unJoueur!=null);
        this.tourJoueur = unJoueur;
    }

    //Autres methodes
    public void mettreEnPauseTemps(){
        tempsPartie.stop();
    }

    public void mettreEnMarcheTemps(){
        tempsPartie.start();
    }


}
