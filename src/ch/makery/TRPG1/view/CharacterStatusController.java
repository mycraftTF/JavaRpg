package ch.makery.TRPG1.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ch.makery.TRPG1.MainApp;
import ch.makery.TRPG1.model.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
 
public class CharacterStatusController  implements Initializable {
	
	MainApp ma = new MainApp();
	Player pl = new Player();
	
    @FXML
    private AnchorPane mainpane;
    @FXML
    private Scene sc;
    @FXML
    private Label hp;
  

    
   // primaryStage.setScene(scene);
    
    

   
   
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
  
        mainpane.setOnKeyPressed(ke ->{
        	KeyCode keyCode = ke.getCode();
        	System.out.println("asdf");
        	if(keyCode.equals(KeyCode.W)) {
        		System.out.println("asdf");
        	}
        	else if(keyCode.equals(keyCode.ESCAPE)) {
        		removeScene();
        	}
        });
        
    }
    public void removeScene() {
    	Parent move = (Parent) hp.getParent();
    	AnchorPane root = (AnchorPane) hp.getScene().getRoot();
    	root.getChildren().remove(move);
    }
}