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
	//���� ���������� �� ���ϴ� �̸��� ���Ͽ� ISC.setTextBox() �Լ��� ������ �ѱ��.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public void setSeq(File file) throws IOException, InterruptedException{ // ������ ���� �Լ��� setScene ���� ������ �����ҽ� �ش� ���� �ٲٴ� ���� ���� ���� �������ϴ� �Լ�
		check = 99;
    	System.out.println("setTextBOx�Լ� ���ԿϷ�");
    	int input = 0;
    	FileReader fr = new FileReader(file);
    	BufferedReader bufR = new BufferedReader(fr);
    	System.out.println("talks �迭 �ʱ�ȭ �Ϸ�");
    	
    	while((talks[input] = bufR.readLine()) != null) { //��� �Է� �Ϸ�
    		//talks[input] = line;
    		System.out.println(talks[input]);
    		input++;
    	}
    	for(int i =0;talks[i] != null;i++) {
    		if(talks[i].contains("setScene")) {//���� setScene ��ɾ� ���Խ�
    			
    		}
    		else if(talks[i].contains("say")) {//���� say ��ɾ� ���Խ�
    			
    		}
    	}
    	System.out.println("talks�� ��� �Է¿Ϸ�");
    	currentLine = 0;
    	bufR.close();
    	System.out.println("�Լ�����");
    }
    */
}

