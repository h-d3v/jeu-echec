package jeuEchec;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import jeuEchec.modele.DAOException;
import jeuEchec.modele.Joueur;
import jeuEchec.modele.Partie;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;



public class ControleurNouvellePartie implements Initializable {
    protected Stage parent;
    protected ResourceBundle resources;
    protected Modele modele;

    @FXML
    private TextField pseudoNoir;

    @FXML
    private TextField pseudoBlanc;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.resources=resourceBundle;
    }

        public ControleurNouvellePartie() {
        }

    /**
     * Mutateur du modèle
     *
     */
    public void setModele(Modele leModele){
        modele=leModele;
    }


        @FXML
        public void retourMenuPrinci() throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/menuPrincipal.fxml"));
            Parent root=loader.load();
            ((ControleurMenuPrincipal)loader.getController()).setParent(parent);
            parent.setScene(new Scene(root));
        }

    /**
     * Créer une nouvelle partie,avec les deux joeurs qui on entrer
     * leur pseudo. Creer aussi les joueurs si ceux-ci sont nouveaux
     * @throws IOException
     * @throws DAOException
     */
    @FXML
        private void jouerPartie() throws IOException, DAOException {
            setModele(new Modele());
            //Ajoute les joueurs au modele et instacie une nouvelle partie
            modele.chargerJoueurs();
            Joueur  joueurBlanc=new Joueur(pseudoBlanc.getText());
            Joueur joueurNoir=new Joueur(pseudoNoir.getText());
            boolean blancExiste=modele.chercherJoueur(joueurBlanc);
            boolean noirExiste=modele.chercherJoueur(joueurNoir);
            if(!blancExiste){modele.ajouterJoueur(joueurBlanc); }
            if(!noirExiste){modele.ajouterJoueur(joueurNoir);}
            ArrayList<Joueur> joueursPartie=new ArrayList<Joueur>();
            joueursPartie.add(joueurBlanc);
            joueursPartie.add(joueurNoir);
            modele.setJoueursCourrant(joueursPartie);

            Partie partie=new Partie(joueurBlanc, joueurNoir);

            modele.ajouterPartie(partie);

            //on charge l'affichage de la nouvelle partie
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/partieEnCours.fxml"));
            Parent root=loader.load();
            ((ControleurPartieEnCours)loader.getController()).setParent(parent);
            parent.setScene(new Scene(root));
            parent.setTitle(joueurBlanc.getPseudo()+" VS "+joueurNoir.getPseudo());
        }

        public void setParent(Stage parent) { this.parent = parent; }


}
