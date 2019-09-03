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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
 
public class StartController  implements Initializable {
	
	MainApp ma = new MainApp();
	
    @FXML
    private Button StartBtn;
    @FXML
    private Button ExitBtn;

    IngameSceneController ISC = new IngameSceneController();
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
        StartBtn.setOnMouseClicked( event -> { 
            System.out.println("Changed to MainPage.fxml");
            try {
                Parent second =FXMLLoader.load(getClass().getResource("Main.fxml"));
                Scene scene = new Scene(second);
                Stage primaryStage =(Stage) StartBtn.getScene().getWindow();
                primaryStage.setScene(scene);
               // Stage sc =(Stage) StartBtn.getScene().getWindow();
                
                
                //sc.getChildren()remove(ISC.AP);
            } catch (IOException e) {
                // TODO Auto-generated catch bloc"r
                e.printStackTrace();
            }
            
        });
        
        ExitBtn.setOnMouseClicked( event ->{
        	System.exit(0);
        });
        
       
        
    }
}
 
