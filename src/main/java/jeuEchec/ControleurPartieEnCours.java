package jeuEchec;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import jeuEchec.modele.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class ControleurPartieEnCours implements Initializable {
    protected Stage parent;
    ResourceBundle resources;
    protected Modele modele;
    protected String caseDepart, caseDestination;
    protected double temps;

    @FXML
    private Button c00;
    @FXML
    private Button c01;
    @FXML
    private Button c02;
    @FXML
    private Button c03;
    @FXML
    private Button c04;
    @FXML
    private Button c05;
    @FXML
    private Button c06;
    @FXML
    private Button c07;
    @FXML
    private Button c10;
    @FXML
    private Button c11;
    @FXML
    private Button c12;
    @FXML
    private Button c13;
    @FXML
    private Button c14;
    @FXML
    private Button c15;
    @FXML
    private Button c16;
    @FXML
    private Button c17;
    @FXML
    private Button c20;
    @FXML
    private Button c21;
    @FXML
    private Button c22;
    @FXML
    private Button c23;
    @FXML
    private Button c24;
    @FXML
    private Button c25;
    @FXML
    private Button c26;
    @FXML
    private Button c27;
    @FXML
    private Button c30;
    @FXML
    private Button c31;
    @FXML
    private Button c32;
    @FXML
    private Button c33;
    @FXML
    private Button c34;
    @FXML
    private Button c35;
    @FXML
    private Button c36;
    @FXML
    private Button c37;
    @FXML
    private Button c40;
    @FXML
    private Button c41;
    @FXML
    private Button c42;
    @FXML
    private Button c43;
    @FXML
    private Button c44;
    @FXML
    private Button c45;
    @FXML
    private Button c46;
    @FXML
    private Button c47;
    @FXML
    private Button c50;
    @FXML
    private Button c51;
    @FXML
    private Button c52;
    @FXML
    private Button c53;
    @FXML
    private Button c54;
    @FXML
    private Button c55;
    @FXML
    private Button c56;
    @FXML
    private Button c57;
    @FXML
    private Button c60;
    @FXML
    private Button c61;
    @FXML
    private Button c62;
    @FXML
    private Button c63;
    @FXML
    private Button c64;
    @FXML
    private Button c65;
    @FXML
    private Button c66;
    @FXML
    private Button c67;
    @FXML
    private Button c70;
    @FXML
    private Button c71;
    @FXML
    private Button c72;
    @FXML
    private Button c73;
    @FXML
    private Button c74;
    @FXML
    private Button c75;
    @FXML
    private Button c76;
    @FXML
    private Button c77;

    @FXML
    private GridPane grille;

    @FXML
    private Label lblTemps;

    private Echiquier echiquier = new Echiquier();




    public ControleurPartieEnCours() {
    }




    @FXML
    private void initilaliser(){
    }



    /*@FXML
    private void selectionerDestination(){

         if(evt.getTarget()==c11){
             piece=c11.getId();
             echiquier.getPieces()[11].setCoordonees(1,1);
         }

    }*/
    /*@FXML
    private void atterrir(ActionEvent evt){
        System.out.println("ddd");
        if(evt.getTarget()==c66){
            c66.setText(piece);
        }
    }
    */
    //boolean decoller=true;
    /*@FXML
    private void jouerCoup(ActionEvent evt){
        String pieceId;
        if (decoller) {
            if (evt.getTarget() == c11){
                pieceId = c11.getId();
                System.out.println("ddd");
                decoller=false;
            }
        }
        else {
            if(evt.getTarget()==c66){
                echiquier.getPieces()[0].setCoordonees(2,6);
                System.out.println("nvbnvnv");
                decoller=true;
                initilaliser();
            }
        }
    }

    /**
     * Mutateur du parent du controlleur
     * @param parent
     */
    public void setParent(Stage parent) {
        this.parent = parent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Piece[] pieces =echiquier.getPieces();

        for (Piece piece : pieces){
            if(piece.getCoordonneesEnString().equals(c00.getId())){
                c00.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c01.getId())){
                c01.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c02.getId())){
                c02.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c03.getId())){
                c03.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c04.getId())){
                c04.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c05.getId())){
                c05.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c06.getId())){
                c06.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c07.getId())){
                c07.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c10.getId())){
                c10.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c11.getId())){
                c11.setText(piece.toString());
                //c11.setOnAction(this::jouerCoup);
            }
            else if(piece.getCoordonneesEnString().equals(c12.getId())){
                c12.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c13.getId())){
                c13.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c14.getId())){
                c14.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c15.getId())){
                c15.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c16.getId())){
                c16.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c17.getId())){
                c17.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c20.getId())){
                c20.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c21.getId())){
                c21.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c22.getId())){
                c22.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c23.getId())){
                c23.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c24.getId())){
                c24.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c25.getId())){
                c25.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c26.getId())){
                c26.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c27.getId())){
                c27.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c30.getId())){
                c30.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c31.getId())){
                c31.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c32.getId())){
                c32.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c33.getId())){
                c33.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c34.getId())){
                c34.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c35.getId())){
                c35.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c36.getId())){
                c36.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c37.getId())){
                c37.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c40.getId())){
                c40.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c41.getId())){
                c41.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c42.getId())){
                c42.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c43.getId())){
                c43.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c44.getId())){
                c44.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c45.getId())){
                c45.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c46.getId())){
                c46.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c47.getId())){
                c47.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c50.getId())){
                c50.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c51.getId())){
                c51.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c52.getId())){
                c52.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c53.getId())){
                c53.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c54.getId())){
                c54.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c55.getId())){
                c55.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c56.getId())){
                c56.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c57.getId())){
                c57.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c60.getId())){
                c60.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c61.getId())){
                c61.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c62.getId())){
                c62.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c63.getId())){
                c63.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c64.getId())){
                c64.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c65.getId())){
                c65.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c66.getId())){
                c66.setText(piece.toString());
                // c66.setOnAction(this::jouerCoup);

            }
            else if(piece.getCoordonneesEnString().equals(c67.getId())){
                c67.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c70.getId())){
                c70.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c71.getId())){
                c71.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c72.getId())){
                c72.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c73.getId())){
                c73.setText(piece.toString());

            }
            else if(piece.getCoordonneesEnString().equals(c74.getId())){
                c74.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c75.getId())){
                c75.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c76.getId())){
                c76.setText(piece.toString());
            }
            else if(piece.getCoordonneesEnString().equals(c77.getId())){
                c77.setText(piece.toString());
            }
        }
        this.resources=resourceBundle;
    }

    /**
     * Arrette la partie courrante et retourne au menu principal
     * @throws IOException
     */
    @FXML
    public void abandonner() throws IOException, DAOException {
        //modele.arreterPartieCourrante();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Partie abondonner");
        alert.setHeaderText("Vous avez abondonner la partie");
        alert.setContentText("Vous serez retourner au menu principal");
        alert.showAndWait();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/menuPrincipal.fxml"));
        Parent root=loader.load();
        ((ControleurMenuPrincipal)loader.getController()).setParent(parent);
        parent.setScene(new Scene(root));
    }

    /**
     * mutateur du modele du controlleur
     * @param modele
     */
    public void setModele(Modele modele) {
        this.modele = modele;
    }

}

