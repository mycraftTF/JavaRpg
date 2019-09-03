package ch.makery.TRPG1;

import java.io.IOException;
import java.util.Scanner;

import ch.makery.TRPG1.model.Person;
import ch.makery.TRPG1.view.IngameSceneController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
    	
    	
    	 Parent root = FXMLLoader.load(getClass().getResource("view/Start.fxml"));
         Scene scene = new Scene(root);
         primaryStage.setScene(scene);
         primaryStage.setTitle("TRPG");
         primaryStage.setResizable(false);
         primaryStage.show();
        
    }


    public static void main(String[] args) throws InterruptedException {
    	Maingame mg = new Maingame();
    	mg.start();
    	mg.run();
        launch(args);        
    }
    
}