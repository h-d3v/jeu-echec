package jeuEchec;

import jeuEchec.modele.*;

import java.util.ArrayList;

public class Modele {
    protected Partie partieCourrante;
    protected ArrayList<Joueur> listeJoueurs;
    protected ArrayList<Joueur> joueursCourrant;
    protected ArrayList<Partie> listeParties;
    private JoueurDAO joueurDao=new JoueurDAO();
    private PartieDAO partieDao=new PartieDAO();

    /**
     * Constructeur.
     *Cree une nouvelle liste de joueurs
     */
    public Modele() {
        listeJoueurs=new ArrayList<Joueur>();
        listeParties=new ArrayList<Partie>();
    }
    /**
     * Ajoute une partie a la base de donnee
     * @param unePartie la partie a ajouter
     * @throws DAOException
     */
    public void ajouterPartie(Partie unePartie) throws DAOException {
        assert(unePartie!=null):"La partie a ajouter ne peut pas etre null";
        partieDao.créer(unePartie);
        listeParties.add(unePartie);
    }


    /**
     *
     * @return la partie courrante
     */
    public Partie getPartieCourrante() {
        return partieCourrante;
    }

    /**
     * Mutateur de la partie courrante
     * @param partieCourrante
     */
    public void setPartieCourrante(Partie partieCourrante) {
        this.partieCourrante = partieCourrante;
    }

    public void arreterPartieCourrante() throws DAOException {
        assert(partieCourrante.getJoueurGagnant()!=null);
        partieCourrante.terminerPartie(partieCourrante.getJoueurGagnant());
        partieDao.modifier(partieCourrante);
    }

    /**
     * Mutateur de la note courante
     * @param deuxJoueurs les joueurs de la partie courrante
     */
    public void setJoueursCourrant(ArrayList<Joueur> deuxJoueurs){
        assert (deuxJoueurs.size()==2) : "Il doit y avoir deux joueurs dans une partie";
        assert(listeJoueurs.contains(deuxJoueurs.get(0))):"Le joueur courrant 1 n'existe pas";
        assert(listeJoueurs.contains(deuxJoueurs.get(1))):"Le joueur courrant 2 n'existe pas";
        joueursCourrant=deuxJoueurs;
    }

    /**
     * Charge la liste de joueurs et de parties à partir de la base de données
     *
     */
    public void chargerJoueurs() throws DAOException {
        listeJoueurs=joueurDao.chercherTous();
    }

    /**
     * @return  la liste de joueurs inscrit au jeu
     */
    public ArrayList<Joueur> getListeJoueurs() {
        return listeJoueurs;
    }

    /**
     *Ajoute  un nouveau joueur a la liste
     * @param unJoueur le nouveau joueur a ajouter
     * @throws DAOException
     */
    public void ajouterJoueur(Joueur unJoueur) throws DAOException {
        assert(unJoueur!=null):"Le joueur a ajouter est null";
        joueurDao.créer(unJoueur);
        listeJoueurs.add(unJoueur);
    }

    /**
     * Cherche un joueur dans la liste de joueur de la partie
     * @param joueur le joueur a rechercher
     *
     */
    public boolean chercherJoueur(Joueur joueur){
        for (Joueur unJoueur:listeJoueurs) {
            if(unJoueur.getPseudo().equals(joueur.getPseudo())){
               return true;
            }
        }
        return false;
    }

}
