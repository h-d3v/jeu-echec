package jeuEchec.modele;

import com.google.common.base.Stopwatch;
import javafx.scene.paint.Stop;


public class Partie {

    private int idPartie;
    private Joueur joueurBlanc;
    private Joueur joueurNoir;
    private boolean partieEnCours;
    public Stopwatch tempsPartie;
    private Joueur tourJoueur;
    private Joueur joueurGagant;
    private static int compteur=1;
    private Echiquier echequier;

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
        //assert tempsPartie != null;
        //tempsPartie.start();
        partieEnCours=true;
        this.joueurBlanc=joueurBlanc;
        this.joueurNoir=joueurNoir;
        this.echequier=new Echiquier();
    }
}
