package jeuEchec.modele;

import java.util.ArrayList;

/**
 *
 */
public class Joueur{
    // //=======================Proprietes================================
    protected String pseudo;
    protected ArrayList<Partie> parties;
    // //=================Constructeurs====================================
    /**
     *Constructeur complet
     * @param unPseudo String le pseudo d'un joueur
     * @param desParties ArrayList<Partie>, la liste de parties du joueur
     * @throws IllegalArgumentException si le pseudo est null ou vide
     * @throws IllegalArgumentException si la liste des parties est null
     */
    public  Joueur( String unPseudo,  ArrayList<Partie> desParties) throws IllegalArgumentException{

        if (unPseudo.equals("")||unPseudo==null){
            throw new IllegalArgumentException("Le pseudo ne peut pas etre null ou vide");
        }

        if (desParties==null) throw new IllegalArgumentException("Les parties ne peuvent pas etre null");

        pseudo=unPseudo;
        parties=desParties;
    }

    /**Constructeur avec valeurs par defaut
     * @param unPseudo pseudo du joueur
     * @throws IllegalArgumentException si le pseudo est null ou vide
     */
    public Joueur(String unPseudo) throws IllegalArgumentException{
        if (unPseudo.equals("") || unPseudo==null){
            throw new IllegalArgumentException("Le pseudo ne peut pas etre null ou vide");
        }
        pseudo=unPseudo;
        parties= new ArrayList<Partie>();
    }
    // //=================Accesseurs/Mutateurs(get/set)====================================
    /**
     *Accesseur de de l'attribut pseudo du joueur
     * @return String le pseudo du joueur
     */
    public String getPseudo(){
        return pseudo;
    }

    /**
     * Accesseur de de l'attribut parties
     * @return parties ArrayList les parties du joueurs
     */

    public ArrayList<Partie> getParties(){
        return parties;
    }

    /**
     * mutateur de l'attribut parties
     * @param parties ArrayList des parties
     * @throws IllegalArgumentException si la liste de parties est null
     */
    public void setParties(ArrayList<Partie> parties) {
        if (parties==null) throw new IllegalArgumentException("Les parties ne peuvent pas etre null");
        this.parties = parties;
    }
    // //=================Methodes====================================

    /**
     * ajoute une partie a la liste de parties du joueur
     * @param unePartie partie a ajouter
     * @throws IllegalArgumentException si la liste de parties est null
     */
    public void ajouterParties(Partie unePartie){

        if (unePartie==null){
            throw new IllegalArgumentException("Les parties ne peuvent pas etre null");
        }
        parties.add(unePartie);
    }

}