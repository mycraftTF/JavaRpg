package ch.makery.TRPG1.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import ch.makery.TRPG1.MainApp;
import ch.makery.TRPG1.Story;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
 
public class IngameSceneController  implements Initializable {
	
	MainApp ma = new MainApp();
	
	//IngameSceneController ISC = new IngameSceneController();
	//MoveMenuController MMC = new MoveMenuController();
	
    @FXML
    public ImageView Background;
    @FXML AnchorPane AP;
    @FXML
    public ImageView MoveP;
    @FXML
    private Label Text;
    @FXML
    private ImageView TextField;
    
    
    
    File file;
    private String currentText;
    int i = 0;
    int currentLine = 0;
    String line = "";
    static String[] talks = new String[100];
   // String[] sc = new String[2];
    
	int ch = 0;
    //int a=1;
    String jpgf = "지하통로-toavmf.jpg";
    String laboratory = "연구실-toavmf.jpg";
   
  
    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
    	Story story = new Story();
    	Background.setImage(new Image(laboratory)); 
    	//TextField.setImage(new Image("텍스트이미지.png"));
    	MoveP.setImage(new Image("이동.png"));

    	AP.setOnKeyPressed(ke ->{
        	KeyCode keyCode = ke.getCode();
        	//System.out.println("asdf");
        	if(keyCode.equals(KeyCode.P)) {
        		 Parent second;
				try {
					second = FXMLLoader.load(getClass().getResource("CharacterStatus.fxml"));
	                 Scene scene = new Scene(second);
	                 Stage primaryStage =(Stage) MoveP.getScene().getWindow();
	                 primaryStage.setScene(scene);
	                 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        });
    	
    	
    	
    	
    	TranslateTransition tt = new TranslateTransition();
    	
    	
    	
    	Text.setOnMouseClicked(event -> {
    		while(talks[currentLine] != null) {	//만약 현대사가 null값이 아니라면 :
    			String[] sc = talks[currentLine].split(" ", 2);
    			
    			if(talks[currentLine].contains("setScene")) {	//만약 출력하려고 하는 문자열이 셋신 명령어라면
    				Background.setImage(new Image(sc[1])); //setScene 이후의 공백 하나를 기준으로 나눠 그 후반부를 실행
    				//Background.setImage(new Image(talks[currentLine].substring(9)));
    				
    			}
    			else if(talks[currentLine].contains("say")) {// 만약 문자열이 say 명령어라면
    				//Text.setText(sc[1]);
    				Text.setText(sc[1]);
    				System.out.println(sc[1]);
    			}
        		currentLine++;
        			
            	
            	System.out.println("line:" + currentLine + talks[currentLine]);
    		}
    		
    	});
    	
    	
    		

    	MoveP.setOnMouseReleased(event ->{ //누르로 릴리즈 후 동작, 이동 세부메뉴 항목 띄우기
    		MoveP.setImage(new Image("이동.png"));
    		System.out.println("이미지 변환 완료");
    		try {
    			System.out.println("대기");
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		try {
                Parent move = FXMLLoader.load(getClass().getResource("MoveMenu.fxml"));
                AnchorPane root = (AnchorPane)Text.getScene().getRoot();
                root.getChildren().add(move);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	});
    	 MoveP.setOnMouseEntered(event ->{
    		MoveP.setImage(new Image("이동.png"));
    		System.out.println("Mouse Entered");
    		tt.setNode(MoveP);
    	    tt.setFromX(15);
    	    tt.setToX(10);
    	    tt.setDuration(new Duration(10));
    		tt.play();
    	 });
    	 MoveP.setOnMouseExited(event ->{
    		tt.setNode(MoveP);
 	    	tt.setFromX(10);
 	    	tt.setToX(15);
 	    	tt.setDuration(new Duration(10));
 	    	tt.play();
    		// MoveP.setImage(new Image("MoveProto.jpg"));
    		System.out.println("MouseEXited");
    	 });
    	 MoveP.setOnMousePressed(event ->{ // 누를때 변환 이미지
    		 MoveP.setImage(new Image("이동pressed.png"));
    	 });
    	 
    }


    public void setTextBox(File file) throws IOException, InterruptedException {
    	ch = 99;
    	System.out.println("setTextBox함수 진입완료");
    	int input = 0;
    	FileReader fr = new FileReader(file);
    	BufferedReader bufR = new BufferedReader(fr);
    	System.out.println("talks 배열 초기화 완료");
    	
    	while((talks[input] = bufR.readLine()) != null) {
    		//talks[input] = line;
    		System.out.println(talks[input]);
    		input++;
    	}
    	System.out.println("talks에 대사 입력완료");
    	currentLine = 0;
    	bufR.close();
    	System.out.println("함수종료");
    }
}