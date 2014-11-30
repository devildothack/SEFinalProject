/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Dalia
 */
public class DisplayPanel extends JPanel {

    NodeList college;
    NodeList mission;
    
    public DisplayPanel() {
        
        try {

            File colleges = new File("colleges.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(colleges);
            doc.getDocumentElement();

            college = doc.getElementsByTagName("school");
            mission = doc.getElementsByTagName("mission");
            
        } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	   } catch (IOException ioe) {
		ioe.printStackTrace();
	   } catch (SAXException sae) {
		sae.printStackTrace();
	   } 
        
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(580, 410));
        add(scrollPane, BorderLayout.CENTER);
        //if()
        for (int i = 0; i < college.getLength(); i++) {
                textArea.append(college.item(i).getTextContent()+ "" + "\n");
                textArea.append(mission.item(i).getTextContent()+ "" + "\n");
            } 
    }
}

