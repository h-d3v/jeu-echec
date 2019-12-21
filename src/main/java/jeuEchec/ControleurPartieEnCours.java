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
import javafx.scene.text.Font;
import javafx.stage.Stage;
import jeuEchec.modele.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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


   // Echiquier echiquier=modele.partieCourrante.getEchiquier();
    Echiquier echiquier= new Echiquier();


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


        c00.setFont(Font.font(25));
        c01.setFont(Font.font(25));
        c02.setFont(Font.font(25));
        c03.setFont(Font.font(25));
        c04.setFont(Font.font(25));
        c05.setFont(Font.font(25));
        c06.setFont(Font.font(25));
        c07.setFont(Font.font(25));
        c10.setFont(Font.font(25));
        c11.setFont(Font.font(25));
        c12.setFont(Font.font(25));
        c13.setFont(Font.font(25));
        c14.setFont(Font.font(25));
        c15.setFont(Font.font(25));
        c16.setFont(Font.font(25));
        c17.setFont(Font.font(25));
        c20.setFont(Font.font(25));
        c21.setFont(Font.font(25));
        c22.setFont(Font.font(25));
        c23.setFont(Font.font(25));
        c24.setFont(Font.font(25));
        c25.setFont(Font.font(25));
        c26.setFont(Font.font(25));
        c27.setFont(Font.font(25));
        c30.setFont(Font.font(25));
        c31.setFont(Font.font(25));
        c32.setFont(Font.font(25));
        c33.setFont(Font.font(25));
        c34.setFont(Font.font(25));
        c35.setFont(Font.font(25));
        c36.setFont(Font.font(25));
        c37.setFont(Font.font(25));
        c40.setFont(Font.font(25));
        c41.setFont(Font.font(25));
        c42.setFont(Font.font(25));
        c43.setFont(Font.font(25));
        c44.setFont(Font.font(25));
        c45.setFont(Font.font(25));
        c46.setFont(Font.font(25));
        c47.setFont(Font.font(25));
        c50.setFont(Font.font(25));
        c51.setFont(Font.font(25));
        c52.setFont(Font.font(25));
        c53.setFont(Font.font(25));
        c54.setFont(Font.font(25));
        c55.setFont(Font.font(25));
        c56.setFont(Font.font(25));
        c57.setFont(Font.font(25));
        c60.setFont(Font.font(25));
        c61.setFont(Font.font(25));
        c62.setFont(Font.font(25));
        c63.setFont(Font.font(25));
        c64.setFont(Font.font(25));
        c65.setFont(Font.font(25));
        c66.setFont(Font.font(25));
        c67.setFont(Font.font(25));
        c70.setFont(Font.font(25));
        c71.setFont(Font.font(25));
        c72.setFont(Font.font(25));
        c73.setFont(Font.font(25));
        c74.setFont(Font.font(25));
        c75.setFont(Font.font(25));
        c76.setFont(Font.font(25));
        c77.setFont(Font.font(25));

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



            c00.setOnAction(this::jouerCoup);
            c01.setOnAction(this::jouerCoup);
            c02.setOnAction(this::jouerCoup);
            c03.setOnAction(this::jouerCoup);
            c04.setOnAction(this::jouerCoup);
            c05.setOnAction(this::jouerCoup);
            c06.setOnAction(this::jouerCoup);
            c07.setOnAction(this::jouerCoup);
            c10.setOnAction(this::jouerCoup);
            c11.setOnAction(this::jouerCoup);
            c12.setOnAction(this::jouerCoup);
            c13.setOnAction(this::jouerCoup);
            c14.setOnAction(this::jouerCoup);
            c15.setOnAction(this::jouerCoup);
            c16.setOnAction(this::jouerCoup);
            c17.setOnAction(this::jouerCoup);
            c20.setOnAction(this::jouerCoup);
            c21.setOnAction(this::jouerCoup);
            c22.setOnAction(this::jouerCoup);
            c23.setOnAction(this::jouerCoup);
            c24.setOnAction(this::jouerCoup);
            c25.setOnAction(this::jouerCoup);
            c26.setOnAction(this::jouerCoup);
            c27.setOnAction(this::jouerCoup);
            c30.setOnAction(this::jouerCoup);
            c31.setOnAction(this::jouerCoup);
            c32.setOnAction(this::jouerCoup);
            c33.setOnAction(this::jouerCoup);
            c34.setOnAction(this::jouerCoup);
            c35.setOnAction(this::jouerCoup);
            c36.setOnAction(this::jouerCoup);
            c37.setOnAction(this::jouerCoup);
            c40.setOnAction(this::jouerCoup);
            c41.setOnAction(this::jouerCoup);
            c42.setOnAction(this::jouerCoup);
            c43.setOnAction(this::jouerCoup);
            c44.setOnAction(this::jouerCoup);
            c45.setOnAction(this::jouerCoup);
            c46.setOnAction(this::jouerCoup);
            c47.setOnAction(this::jouerCoup);
            c50.setOnAction(this::jouerCoup);
            c51.setOnAction(this::jouerCoup);
            c52.setOnAction(this::jouerCoup);
            c53.setOnAction(this::jouerCoup);
            c54.setOnAction(this::jouerCoup);
            c55.setOnAction(this::jouerCoup);
            c56.setOnAction(this::jouerCoup);
            c57.setOnAction(this::jouerCoup);
            c60.setOnAction(this::jouerCoup);
            c61.setOnAction(this::jouerCoup);
            c62.setOnAction(this::jouerCoup);
            c63.setOnAction(this::jouerCoup);
            c64.setOnAction(this::jouerCoup);
            c65.setOnAction(this::jouerCoup);
            c66.setOnAction(this::jouerCoup);
            c67.setOnAction(this::jouerCoup);
            c70.setOnAction(this::jouerCoup);
            c71.setOnAction(this::jouerCoup);
            c72.setOnAction(this::jouerCoup);
            c73.setOnAction(this::jouerCoup);
            c74.setOnAction(this::jouerCoup);
            c75.setOnAction(this::jouerCoup);
            c76.setOnAction(this::jouerCoup);
            c77.setOnAction(this::jouerCoup);


        }

    }




    String pieceId = "";
    boolean decoller=true;
    @FXML
    private void jouerCoup(ActionEvent evt){
        if (decoller) {
             if (evt.getTarget() == c00){
                pieceId = c00.getId();
                decoller=false;
                c00.setText("");
            }
            else if (evt.getTarget() == c01){
                pieceId = c01.getId();
                decoller=false;
                c01.setText("");
            }
            else if (evt.getTarget() == c02){
                pieceId = c02.getId();
                decoller=false;
                c02.setText("");
            }
            else if (evt.getTarget() == c03){
                pieceId = c03.getId();
                decoller=false;
                c03.setText("");
            }
            else if (evt.getTarget() == c04){
                pieceId = c04.getId();
                decoller=false;
                c04.setText("");
            }
            else if (evt.getTarget() == c05){
                pieceId = c05.getId();
                decoller=false;
                c05.setText("");
            }
            else if (evt.getTarget() == c06){
                pieceId = c06.getId();
                decoller=false;
                c06.setText("");
            }
            else if (evt.getTarget() == c07){
                pieceId = c07.getId();
                decoller=false;
                c07.setText("");
            }
            else if (evt.getTarget() == c10){
                pieceId = c10.getId();
                decoller=false;
                c10.setText("");
            }
            else if (evt.getTarget() == c11){
                pieceId = c11.getId();
                decoller=false;
                c11.setText("");
            }
            else if (evt.getTarget() == c12){
                pieceId = c12.getId();
                decoller=false;
                c12.setText("");
            }
            else if (evt.getTarget() == c13){
                pieceId = c13.getId();
                decoller=false;
                c13.setText("");
            }
            else if (evt.getTarget() == c14){
                pieceId = c14.getId();
                decoller=false;
                c14.setText("");
            }
            else if (evt.getTarget() == c15){
                pieceId = c15.getId();
                decoller=false;
                c15.setText("");
            }
            else if (evt.getTarget() == c16){
                pieceId = c16.getId();
                decoller=false;
                c16.setText("");
            }
            else if (evt.getTarget() == c17){
                pieceId = c17.getId();
                decoller=false;
                c17.setText("");
            }
            else if (evt.getTarget() == c20){
                pieceId = c20.getId();
                decoller=false;
                c20.setText("");
            }
            else if (evt.getTarget() == c21){
                pieceId = c21.getId();
                decoller=false;
                c21.setText("");
            }
            else if (evt.getTarget() == c22){
                pieceId = c22.getId();
                decoller=false;
                c22.setText("");
            }
            else if (evt.getTarget() == c23){
                pieceId = c23.getId();
                decoller=false;
                c23.setText("");
            }
            else if (evt.getTarget() == c24){
                pieceId = c24.getId();
                decoller=false;
                c24.setText("");
            }
            else if (evt.getTarget() == c25){
                pieceId = c25.getId();
                decoller=false;
                c25.setText("");
            }
            else if (evt.getTarget() == c26){
                pieceId = c26.getId();
                decoller=false;
                c26.setText("");
            }
            else if (evt.getTarget() == c27){
                pieceId = c27.getId();
                decoller=false;
                c27.setText("");
            }
            else if (evt.getTarget() == c30){
                pieceId = c30.getId();
                decoller=false;
                c30.setText("");
            }
            else if (evt.getTarget() == c31){
                pieceId = c31.getId();
                decoller=false;
                c31.setText("");
            }
            else if (evt.getTarget() == c32){
                pieceId = c32.getId();
                decoller=false;
                c32.setText("");
            }
            else if (evt.getTarget() == c33){
                pieceId = c33.getId();
                decoller=false;
                c33.setText("");
            }
            else if (evt.getTarget() == c34){
                pieceId = c34.getId();
                decoller=false;
                c34.setText("");
            }
            else if (evt.getTarget() == c35){
                pieceId = c35.getId();
                decoller=false;
                c35.setText("");
            }
            else if (evt.getTarget() == c36){
                pieceId = c36.getId();
                decoller=false;
                c36.setText("");
            }
            else if (evt.getTarget() == c37){
                pieceId = c37.getId();
                decoller=false;
                c37.setText("");
            }
            else if (evt.getTarget() == c40){
                pieceId = c40.getId();
                decoller=false;
                c40.setText("");
            }
            else if (evt.getTarget() == c41){
                pieceId = c41.getId();
                decoller=false;
                c41.setText("");
            }
            else if (evt.getTarget() == c42){
                pieceId = c42.getId();
                decoller=false;
                c42.setText("");
            }
            else if (evt.getTarget() == c43){
                pieceId = c43.getId();
                decoller=false;
                c43.setText("");
            }
            else if (evt.getTarget() == c44){
                pieceId = c44.getId();
                decoller=false;
                c44.setText("");
            }
            else if (evt.getTarget() == c45){
                pieceId = c45.getId();
                decoller=false;
                c45.setText("");
            }
            else if (evt.getTarget() == c46){
                pieceId = c46.getId();
                decoller=false;
                c46.setText("");
            }
            else if (evt.getTarget() == c47){
                pieceId = c47.getId();
                decoller=false;
                c47.setText("");
            }
            else if (evt.getTarget() == c50){
                pieceId = c50.getId();
                decoller=false;
                c50.setText("");
            }
            else if (evt.getTarget() == c51){
                pieceId = c51.getId();
                decoller=false;
                c51.setText("");
            }
            else if (evt.getTarget() == c52){
                pieceId = c52.getId();
                decoller=false;
                c52.setText("");
            }
            else if (evt.getTarget() == c53){
                pieceId = c53.getId();
                decoller=false;
                c53.setText("");
            }
            else if (evt.getTarget() == c54){
                pieceId = c54.getId();
                decoller=false;
                c54.setText("");
            }
            else if (evt.getTarget() == c55){
                pieceId = c55.getId();
                decoller=false;
                c55.setText("");
            }
            else if (evt.getTarget() == c56){
                pieceId = c56.getId();
                decoller=false;
                c56.setText("");
            }
            else if (evt.getTarget() == c57){
                pieceId = c57.getId();
                decoller=false;
                c57.setText("");
            }
            else if (evt.getTarget() == c60){
                pieceId = c60.getId();
                decoller=false;
                c60.setText("");
            }
            else if (evt.getTarget() == c61){
                pieceId = c61.getId();
                decoller=false;
                c61.setText("");
            }
            else if (evt.getTarget() == c62){
                pieceId = c62.getId();
                decoller=false;
                c62.setText("");
            }
            else if (evt.getTarget() == c63){
                pieceId = c63.getId();
                decoller=false;
                c63.setText("");
            }
            else if (evt.getTarget() == c64){
                pieceId = c64.getId();
                decoller=false;
                c64.setText("");
            }
            else if (evt.getTarget() == c65){
                pieceId = c65.getId();
                decoller=false;
                c65.setText("");
            }
            else if (evt.getTarget() == c66){
                pieceId = c66.getId();
                decoller=false;
                c66.setText("");
            }
            else if (evt.getTarget() == c67){
                pieceId = c67.getId();
                decoller=false;
                c67.setText("");
            }
            else if (evt.getTarget() == c70){
                pieceId = c70.getId();
                decoller=false;
                c70.setText("");
            }
            else if (evt.getTarget() == c71){
                pieceId = c71.getId();
                decoller=false;
                c71.setText("");
            }
            else if (evt.getTarget() == c72){
                pieceId = c72.getId();
                decoller=false;
                c72.setText("");
            }
            else if (evt.getTarget() == c73){
                pieceId = c73.getId();
                decoller=false;
                c73.setText("");
            }
            else if (evt.getTarget() == c74){
                pieceId = c74.getId();
                decoller=false;
                c74.setText("");
            }
            else if (evt.getTarget() == c75){
                pieceId = c75.getId();
                decoller=false;
                c75.setText("");
            }
            else if (evt.getTarget() == c76){
                pieceId = c76.getId();
                decoller=false;
                c76.setText("");
            }
            else if (evt.getTarget() == c77){
                pieceId = c77.getId();
                decoller=false;
                c77.setText("");
            }

        }
        else {
            if(evt.getTarget()==c00){

                int destX= Integer.parseInt(c00.getId().substring(0,1));
                int destY=Integer.parseInt(c00.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c00.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c01){

                int destX= Integer.parseInt(c01.getId().substring(0,1));
                int destY=Integer.parseInt(c01.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c01.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c02){

                int destX= Integer.parseInt(c02.getId().substring(0,1));
                int destY=Integer.parseInt(c02.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c02.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c03){

                int destX= Integer.parseInt(c03.getId().substring(0,1));
                int destY=Integer.parseInt(c03.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c03.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c04){

                int destX= Integer.parseInt(c04.getId().substring(0,1));
                int destY=Integer.parseInt(c04.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c04.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c05){

                int destX= Integer.parseInt(c05.getId().substring(0,1));
                int destY=Integer.parseInt(c05.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c05.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c06){

                int destX= Integer.parseInt(c06.getId().substring(0,1));
                int destY=Integer.parseInt(c06.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c06.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c07){

                int destX= Integer.parseInt(c07.getId().substring(0,1));
                int destY=Integer.parseInt(c07.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c07.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c10){

                int destX= Integer.parseInt(c10.getId().substring(0,1));
                int destY=Integer.parseInt(c10.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c10.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c11){

                int destX= Integer.parseInt(c11.getId().substring(0,1));
                int destY=Integer.parseInt(c11.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c11.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c12){

                int destX= Integer.parseInt(c12.getId().substring(0,1));
                int destY=Integer.parseInt(c12.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c12.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c13){

                int destX= Integer.parseInt(c13.getId().substring(0,1));
                int destY=Integer.parseInt(c13.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c13.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c14){

                int destX= Integer.parseInt(c14.getId().substring(0,1));
                int destY=Integer.parseInt(c14.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c14.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c15){

                int destX= Integer.parseInt(c15.getId().substring(0,1));
                int destY=Integer.parseInt(c15.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c15.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c16){

                int destX= Integer.parseInt(c16.getId().substring(0,1));
                int destY=Integer.parseInt(c16.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c16.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c17){

                int destX= Integer.parseInt(c17.getId().substring(0,1));
                int destY=Integer.parseInt(c17.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c17.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c20){

                int destX= Integer.parseInt(c20.getId().substring(0,1));
                int destY=Integer.parseInt(c20.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c20.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c21){

                int destX= Integer.parseInt(c21.getId().substring(0,1));
                int destY=Integer.parseInt(c21.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c21.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c22){

                int destX= Integer.parseInt(c22.getId().substring(0,1));
                int destY=Integer.parseInt(c22.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c22.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c23){

                int destX= Integer.parseInt(c23.getId().substring(0,1));
                int destY=Integer.parseInt(c23.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c23.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c24){

                int destX= Integer.parseInt(c24.getId().substring(0,1));
                int destY=Integer.parseInt(c24.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c24.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c25){

                int destX= Integer.parseInt(c25.getId().substring(0,1));
                int destY=Integer.parseInt(c25.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c25.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c26){

                int destX= Integer.parseInt(c26.getId().substring(0,1));
                int destY=Integer.parseInt(c26.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c26.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c27){

                int destX= Integer.parseInt(c27.getId().substring(0,1));
                int destY=Integer.parseInt(c27.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c27.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c30){

                int destX= Integer.parseInt(c30.getId().substring(0,1));
                int destY=Integer.parseInt(c30.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c30.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c31){

                int destX= Integer.parseInt(c31.getId().substring(0,1));
                int destY=Integer.parseInt(c31.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c31.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c32){

                int destX= Integer.parseInt(c32.getId().substring(0,1));
                int destY=Integer.parseInt(c32.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c32.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c33){

                int destX= Integer.parseInt(c33.getId().substring(0,1));
                int destY=Integer.parseInt(c33.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c33.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c34){

                int destX= Integer.parseInt(c34.getId().substring(0,1));
                int destY=Integer.parseInt(c34.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c34.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c35){

                int destX= Integer.parseInt(c35.getId().substring(0,1));
                int destY=Integer.parseInt(c35.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c35.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c36){

                int destX= Integer.parseInt(c36.getId().substring(0,1));
                int destY=Integer.parseInt(c36.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c36.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c37){

                int destX= Integer.parseInt(c37.getId().substring(0,1));
                int destY=Integer.parseInt(c37.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c37.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c40){

                int destX= Integer.parseInt(c40.getId().substring(0,1));
                int destY=Integer.parseInt(c40.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c40.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c41){

                int destX= Integer.parseInt(c41.getId().substring(0,1));
                int destY=Integer.parseInt(c41.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c41.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c42){

                int destX= Integer.parseInt(c42.getId().substring(0,1));
                int destY=Integer.parseInt(c42.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c42.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c43){

                int destX= Integer.parseInt(c43.getId().substring(0,1));
                int destY=Integer.parseInt(c43.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c43.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c44){

                int destX= Integer.parseInt(c44.getId().substring(0,1));
                int destY=Integer.parseInt(c44.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c44.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c45){

                int destX= Integer.parseInt(c45.getId().substring(0,1));
                int destY=Integer.parseInt(c45.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c45.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c46){

                int destX= Integer.parseInt(c46.getId().substring(0,1));
                int destY=Integer.parseInt(c46.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c46.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c47){

                int destX= Integer.parseInt(c47.getId().substring(0,1));
                int destY=Integer.parseInt(c47.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c47.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c50){

                int destX= Integer.parseInt(c50.getId().substring(0,1));
                int destY=Integer.parseInt(c50.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c50.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c51){

                int destX= Integer.parseInt(c51.getId().substring(0,1));
                int destY=Integer.parseInt(c51.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c51.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c52){

                int destX= Integer.parseInt(c52.getId().substring(0,1));
                int destY=Integer.parseInt(c52.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c52.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c53){

                int destX= Integer.parseInt(c53.getId().substring(0,1));
                int destY=Integer.parseInt(c53.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c53.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c54){

                int destX= Integer.parseInt(c54.getId().substring(0,1));
                int destY=Integer.parseInt(c54.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c54.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c55){

                int destX= Integer.parseInt(c55.getId().substring(0,1));
                int destY=Integer.parseInt(c55.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c55.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c56){

                int destX= Integer.parseInt(c56.getId().substring(0,1));
                int destY=Integer.parseInt(c56.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c56.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c57){

                int destX= Integer.parseInt(c57.getId().substring(0,1));
                int destY=Integer.parseInt(c57.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c57.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c60){

                int destX= Integer.parseInt(c60.getId().substring(0,1));
                int destY=Integer.parseInt(c60.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c60.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c61){

                int destX= Integer.parseInt(c61.getId().substring(0,1));
                int destY=Integer.parseInt(c61.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c61.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c62){

                int destX= Integer.parseInt(c62.getId().substring(0,1));
                int destY=Integer.parseInt(c62.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c62.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c63){

                int destX= Integer.parseInt(c63.getId().substring(0,1));
                int destY=Integer.parseInt(c63.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c63.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c64){

                int destX= Integer.parseInt(c64.getId().substring(0,1));
                int destY=Integer.parseInt(c64.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c64.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c65){

                int destX= Integer.parseInt(c65.getId().substring(0,1));
                int destY=Integer.parseInt(c65.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c65.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c66){

                int destX= Integer.parseInt(c66.getId().substring(0,1));
                int destY=Integer.parseInt(c66.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c66.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c67){

                int destX= Integer.parseInt(c67.getId().substring(0,1));
                int destY=Integer.parseInt(c67.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c67.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c70){

                int destX= Integer.parseInt(c70.getId().substring(0,1));
                int destY=Integer.parseInt(c70.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c70.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c71){

                int destX= Integer.parseInt(c71.getId().substring(0,1));
                int destY=Integer.parseInt(c71.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c71.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c72){

                int destX= Integer.parseInt(c72.getId().substring(0,1));
                int destY=Integer.parseInt(c72.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c72.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c73){

                int destX= Integer.parseInt(c73.getId().substring(0,1));
                int destY=Integer.parseInt(c73.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c73.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c74){

                int destX= Integer.parseInt(c74.getId().substring(0,1));
                int destY=Integer.parseInt(c74.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c74.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c75){

                int destX= Integer.parseInt(c75.getId().substring(0,1));
                int destY=Integer.parseInt(c75.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c75.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
            else if(evt.getTarget()==c76){

                int destX= Integer.parseInt(c76.getId().substring(0,1));
                int destY=Integer.parseInt(c76.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c76.setText(echiquier.getPieceParCoordonnees(destX ,destY).toString());
            }
            else if(evt.getTarget()==c77){

                int destX= Integer.parseInt(c77.getId().substring(0,1));
                int destY=Integer.parseInt(c77.getId().substring(1,2));
                echiquier.jouerCoup(echiquier.getPieceParCoordonnees(pieceId),destX, destY);
                decoller=true;
                c77.setText(echiquier.getPieceParCoordonnees(destX,destY).toString());
            }
        }
    }

    public void setParent(Stage parent) {
        this.parent = parent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.resources=resourceBundle;
        initilaliser();
    }

    /**
     * mutateur du modele du controlleur
     * @param modele
     */
    public void setModele(Modele modele) {
        this.modele = modele;
    }

}

