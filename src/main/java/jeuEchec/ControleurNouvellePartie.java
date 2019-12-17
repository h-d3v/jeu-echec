package jeuEchec;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import jeuEchec.modele.Case;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControleurNouvellePartie implements Initializable {
    protected Stage parent;
    protected ResourceBundle resources;
    protected Modele modele;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.resources=resourceBundle;
    }

        public ControleurNouvellePartie() {
        }

        @FXML
        private Button btnNouvellePartie;

        @FXML
        public void retourMenuPrinci() throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/menuPrincipal.fxml"));
            ControleurMenuPrincipal b=new ControleurMenuPrincipal();
            loader.setController(this);
            Parent root=loader.load();
            parent.setScene(new Scene(root));
        }

        @FXML
        private void JouerPartie(){

        }

        public void setParent(Stage parent) { this.parent = parent; }



}
