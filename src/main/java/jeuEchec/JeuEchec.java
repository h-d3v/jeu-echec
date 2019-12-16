package jeuEchec;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class JeuEchec extends Application{

  public void start(Stage stage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/menuPrincipal.fxml"));

    Parent root=loader.load();
    loader.getController();
      
    stage.setScene(new Scene(root));

    stage.show();

  }

    public static void main(String[] args) {
      launch(args);
    }
    
}
