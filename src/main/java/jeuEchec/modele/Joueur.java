package jeuEchec.modele;

import java.util.ArrayList;

public class Joueur {
    private String pseudo;
    private ArrayList parties;


    /**
    *Constructeur
    * @param unPseudo String le pseudo d'un joueur
     */
    public Joueur(String unPseudo){
        pseudo=unPseudo;
        parties=new ArrayList();
    }
    /**
     *Constructeur
     * @param unPseudo String le pseudo d'un joueur
     * @param desParties ArrayList les parties d'un joueur
     */
    public Joueur(String unPseudo, ArrayList<Partie> desParties){
        pseudo=unPseudo;
        parties=desParties;
    }

    /**
     *Accesseur de de l'attribut pseudo du joueur
     * @return pseudo le pseudo du joueur
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * Accesseur de de l'attribut parties
     * @return parties ArrayList les parties du joueurs
     */
    public ArrayList getParties() {
        return parties;
    }

    /**
     * mutateur de l'attribut parties
     * @param parties ArrayList des parties
     */
    public void setParties(ArrayList parties) {
        this.parties = parties;
    }

    /**
     * mutateur de l'attribut pseudo
     * @param pseudo
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
