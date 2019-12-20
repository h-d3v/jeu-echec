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


/**
 * Contrôleur de la fenetre d'avant partie
 *
 */
public class ControleurNouvellePartie implements Initializable {
    protected Stage parent;
    protected ResourceBundle resources;
    protected Modele modele;

    @FXML
    private TextField tFpseudoNoir;

    @FXML
    private TextField tFpseudoBlanc;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.resources=resourceBundle;
    }

    /**
     * constructeur du controleur
     */
    public ControleurNouvellePartie() {
    }

    /**
     * Mutateur du modèle
     *
     */
    public void setModele(Modele leModele){
        modele=leModele;
    }


    /**
     * Retroune a la scene du menu pricipal
     * et met en parametre le bon controlleur
     * @throws IOException
     */
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
        //Valide les pseudos des joueurs
        if(!validerEntrées()){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Pseudo(s) non valide");
            errorAlert.setContentText("Pseudo doivent etre composer d'au moin \n une lettre ou un chiffre");
            errorAlert.showAndWait();
            return;
        }
        //Ajoute les joueurs au modele
        setModele(new Modele());
        modele.chargerJoueurs();
        Joueur  joueurBlanc=new Joueur(tFpseudoBlanc.getText());
        Joueur joueurNoir=new Joueur(tFpseudoNoir.getText());
        boolean blancExiste=modele.chercherJoueur(joueurBlanc);
        boolean noirExiste=modele.chercherJoueur(joueurNoir);
        if(!blancExiste){modele.ajouterJoueur(joueurBlanc); }
        if(!noirExiste){modele.ajouterJoueur(joueurNoir);}
        ArrayList<Joueur> joueursPartie=new ArrayList<Joueur>();
        joueursPartie.add(joueurBlanc);
        joueursPartie.add(joueurNoir);
        modele.setJoueursCourrant(joueursPartie);

        //cree la nouvelle partie
        Partie partie=new Partie(joueurBlanc, joueurNoir);

       // modele.ajouterPartie(partie);

        //on charge l'affichage de la nouvelle partie
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/partieEnCours.fxml"));
        Parent root=loader.load();
        ((ControleurPartieEnCours)loader.getController()).setParent(parent);
        parent.setScene(new Scene(root));
        parent.setTitle(joueurBlanc.getPseudo()+" VS "+joueurNoir.getPseudo());
    }

    /**
     * Valide les entrees des utilisateurs
     * @return boolean si les pseudo des utilisateurs sont valides ou non
     */
    public boolean validerEntrées(){
        boolean valide=false;
        if(tFpseudoNoir.getText().matches("[A-Za-zZ0-9]+") && tFpseudoBlanc.getText().matches("[A-Za-z0-9]+") ){
            tFpseudoNoir.setStyle("-fx-border-color: lightgreen");
            tFpseudoBlanc.setStyle("-fx-border-color: lightgreen");
            valide=true;
        }
        else{
            tFpseudoNoir.setStyle("-fx-border-color: red");
            tFpseudoBlanc.setStyle("-fx-border-color: red");
        }
        return valide;
    }

    /**
     * Mutateur du parent du controleur
     * @param parent le nouveau parent
     */
    public void setParent(Stage parent) { this.parent = parent; }

}
