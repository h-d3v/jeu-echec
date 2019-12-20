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

public class ControleurPartieEnCours implements Initializable {

    protected Stage parent;
    protected ResourceBundle resources;
    protected Modele modele;

    public ControleurPartieEnCours() {
    }

    @FXML
    private Button btnNouvellePartie;

    @FXML
    public void nouvellePartie() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/nouvellePartie.fxml"));
        Parent root=loader.load();
        parent.setScene(new Scene(root));
        ((ControleurNouvellePartie)loader.getController()).setParent(parent);
    }

    public void setParent(Stage parent) {
        this.parent = parent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.resources=resourceBundle;
    }
}

