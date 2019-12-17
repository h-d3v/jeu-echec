package jeuEchec;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControleurMenuPrincipal implements Initializable {
    protected Stage parent;
    ResourceBundle resources;
    protected Modele modele;

    public ControleurMenuPrincipal() {
    }

    @FXML
    private Button btnNouvellePartie;

    @FXML
    private void nouvellePartie() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/fenetreNouvellePartie.fxml"));
        loader.setController(this);
        Parent root=loader.load();
        parent.setScene(new Scene(root));
    }

    @FXML
    private void voirAnciennePartie(){

    }

    public void setParent(Stage parent) {
        this.parent = parent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.resources=resourceBundle;
    }
}

