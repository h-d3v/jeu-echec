package jeuEchec.modele;

import com.google.common.base.Stopwatch;

;



public class Partie {

    private int idPartie;
    private Joueur joueurBlanc;
    private Joueur joueurNoir;
    private boolean partieEnCours;
    private Stopwatch tempsPartie;
    private Joueur tourJoueur;
    private Joueur joueurGagant;
    private static int compteur=1;

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
}
