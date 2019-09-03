package ch.makery.TRPG1.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ch.makery.TRPG1.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
 
public class MainPageController  implements Initializable {
	
	MainApp ma = new MainApp();
	
    @FXML
    private AnchorPane mainpane;
    @FXML
    private Scene sc;
    @FXML
    private Label main;
    @FXML
    private Button Btn;
    
   // primaryStage.setScene(scene);
    
    
    public MainPageController() throws IOException {
    	
    }
   
   
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
  
        mainpane.setOnKeyPressed(ke ->{
        	KeyCode keyCode = ke.getCode();
        	//System.out.println("asdf");
        	if(keyCode.equals(KeyCode.W)) {
        		 Parent second;
				try {
					second = FXMLLoader.load(getClass().getResource("IngameScene2.fxml"));
	                 Scene scene = new Scene(second);
	                 Stage primaryStage =(Stage) Btn.getScene().getWindow();
	                 primaryStage.setScene(scene);
	                 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        });
        
       

        
    }
}