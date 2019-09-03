package ch.makery.TRPG1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import ch.makery.TRPG1.view.IngameSceneController;

public class Story {
	IngameSceneController ISC = new IngameSceneController();
	int check;
	int currentLine;
	static String[] talks = new String[100];
	
	public void prologue() throws InterruptedException, IOException {
		File file = new File("Text/SampleText.txt");
		ISC.setTextBox(file);
	}
	
	public void testCommand() throws IOException, InterruptedException {
		File file = new File("Text/commandTest.txt");
		ISC.setTextBox(file);
	}
	public void tutorial() throws IOException, InterruptedException  {
		File file = new File("Text/tutorial.txt");
		ISC.setTextBox(file);
		
	}
	//위와 같은식으로 한 파일당 이름을 정하여 ISC.setTextBox() 함수에 파일을 넘긴다.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public void setSeq(File file) throws IOException, InterruptedException{ // 시퀸스 설정 함수로 setScene 등의 문장을 포함할시 해당 씬을 바꾸는 등의 연출 등을 시퀸스하는 함수
		check = 99;
    	System.out.println("setTextBOx함수 진입완료");
    	int input = 0;
    	FileReader fr = new FileReader(file);
    	BufferedReader bufR = new BufferedReader(fr);
    	System.out.println("talks 배열 초기화 완료");
    	
    	while((talks[input] = bufR.readLine()) != null) { //대사 입력 완료
    		//talks[input] = line;
    		System.out.println(talks[input]);
    		input++;
    	}
    	for(int i =0;talks[i] != null;i++) {
    		if(talks[i].contains("setScene")) {//만약 setScene 명령어 포함시
    			
    		}
    		else if(talks[i].contains("say")) {//만약 say 명령어 포함시
    			
    		}
    	}
    	System.out.println("talks에 대사 입력완료");
    	currentLine = 0;
    	bufR.close();
    	System.out.println("함수종료");
    }
    */
}

