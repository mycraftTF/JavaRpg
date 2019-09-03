package ch.makery.TRPG1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.Format.TextMode;
import org.jdom2.output.XMLOutputter;


public class WriteXml {
	
	public void writeXml() {
		try {
			
			File fileXml = new File("C:/Users/MYC/eclipse-workspace/TRPG1/test.xml");
			Document document = null;
			Element rootElement = null;
			Element urlElement = null;
			Element userElement = null;
			Element pwdElement = null;
			
			document = new Document();
			rootElement = new Element("db");
			
			rootElement.setAttribute("type", "Player");
			document.addContent(rootElement);
			/*
			urlElement = new Element("url");
			urlElement.setText("URL");
			*/
			rootElement = new Element("Player");
			userElement.setText("playername");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("MaxHP");
			pwdElement.setText("20");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("HP");
			pwdElement.setText("20");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("MaxMP");
			pwdElement.setText("10");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("MP");
			pwdElement.setText("10");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("Level");
			pwdElement.setText("1");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("XP");
			pwdElement.setText("0");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("NeededXP");
			pwdElement.setText("5");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("StatPoint");
			pwdElement.setText("0");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("Strength");
			pwdElement.setText("10");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("Intelligent");
			pwdElement.setText("10");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("Wisdom");
			pwdElement.setText("10");
			rootElement.addContent(userElement);
			
			pwdElement = new Element("Agility");
			pwdElement.setText("10");
			rootElement.addContent(userElement);
			//어떤식으로 xml 뿌릴지 형태 선언
			
			Format format;
			format = Format.getPrettyFormat();
			format.setEncoding("UTF-8");
			format.setTextMode(TextMode.TRIM);
			
			XMLOutputter outputter = new XMLOutputter(format);
			outputter.output(document, new FileWriter(fileXml));
			
		}catch(IOException ex) {
			System.err.println(ex.getMessage());
		}
	}
	
	
	
}
