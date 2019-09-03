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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
 
public class MoveMenuController  implements Initializable {
	
	//MainApp ma = new MainApp();
	
    @FXML
    AnchorPane MovePane;
    @FXML
    Button Btn;
    @FXML
    ImageView BackShade;
    
  
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	BackShade.setOnMouseClicked(event ->{ // ��ư �̿�, �� ��׶��� ���̴� Ŭ���� ���� �޴� ����
    		removeScene();
    	});
    }
    
    
    
    public void removeScene() {
    	Parent move = (Parent) Btn.getParent();
    	AnchorPane root = (AnchorPane) Btn.getScene().getRoot();
    	root.getChildren().remove(move);
    }
}
 /*
Parent move = FXMLLoader.load(getClass().getResource("MoveMenu.fxml"));
AnchorPane root = (AnchorPane)Text.getScene().getRoot();
root.getChildren().add(move);
*/