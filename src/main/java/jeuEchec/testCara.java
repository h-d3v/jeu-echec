package jeuEchec;

import jeuEchec.modele.DAO;
import jeuEchec.modele.DAOException;
import jeuEchec.modele.Joueur;
import jeuEchec.modele.JoueurDAO;

public class testCara {
    public static void main(String[] args) {
        System.out.println("\u2659");

        Joueur joueur= new Joueur("Sin-Deny Thorpe");
        JoueurDAO joueurDAO=new JoueurDAO();
        try {
           System.out.println(joueurDAO.supprimer(joueur));
        }catch (DAOException e){

        }
        try {
           System.out.println(joueurDAO.créer(new Joueur("nouveau Joueur")).getPseudo());
        }
        catch (DAOException e){}



    }
}
