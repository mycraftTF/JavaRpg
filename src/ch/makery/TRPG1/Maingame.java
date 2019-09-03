package ch.makery.TRPG1;

import java.io.IOException;
import java.util.Scanner;

import ch.makery.TRPG1.view.IngameSceneController;

public class Maingame extends Thread {
	
	IngameSceneController ISC = new IngameSceneController();
	Scanner sc = new Scanner(System.in);
	Story story = new Story();
	
	public void run(){
		//WriteXml WX = new WriteXml();
		//WX.writeXml();
				try {
					
					System.out.println("testCommand 실행준비");
					story.prologue();
					System.out.println("testCommand 실행완료");
					
					/*
					prologue:
					for(int i = 0; i<1;i++) {
						story.prologue();
						
					}
				
				
					tutorial:
					for(int i = 0; i<1;i++) {
						
					}
					
					
					
					
					
					
					
					*/
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				} catch (InterruptedException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
          
	}
}
