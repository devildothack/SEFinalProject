/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
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
 * @author jesus
 */
public class reportGeneratortxt {

    File courseXmlFile = new File("./courses.xml");
    File collegeXmlFile = new File("./colleges.xml");
    File courseOutputTxt = new File("./Reports/courseOutputTxt.txt");
    File collegeOutputTxt = new File("./Reports/collegeOutputTxt.txt");

    public void startreportGenerator() throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {

        if (courseOutputTxt.exists()) {
            boolean delete = courseOutputTxt.delete();
            if (delete) {
                System.out.println("File " + courseOutputTxt + " has been regenerated.");

            } else {
                System.out.println("Error! Deleting File " + courseOutputTxt + " .");
            }
        } else {
            System.out.println("File " + courseOutputTxt + " DOES NOT exist. Continuing generating report.");
        }
        PrintWriter writer = new PrintWriter("./Reports/courseOutputTxt.txt", "UTF-8");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(courseXmlFile);

        doc.getDocumentElement()
                .normalize();

        NodeList nList = doc.getElementsByTagName("course");

        writer.println(
                "-------------------------------------------");

        for (int temp = 0;
                temp < nList.getLength();
                temp++) {

            Node nNode = nList.item(temp);

            writer.println("\nCurrent Element :" + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                writer.println("Course id : " + eElement.getAttribute("id"));
                writer.println("Course name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                writer.println("Course prefix : " + eElement.getElementsByTagName("prefix").item(0).getTextContent());
                writer.println("Course description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
                writer.println("Course prerequisite : " + eElement.getElementsByTagName("prerequisite").item(0).getTextContent());
                writer.println("Course hours : " + eElement.getElementsByTagName("hours").item(0).getTextContent());
            }

            writer.println("-------------------------------------------");

        }
        
        writer.flush();
        writer.close();

        if (collegeOutputTxt.exists()) {
            boolean delete = collegeOutputTxt.delete();
            if (delete) {
                System.out.println("File " + collegeOutputTxt + " has been regenerated.");

            } else {
                System.out.println("Error! Deleting File " + collegeOutputTxt + " .");
            }
        } else {
            System.out.println("File " + collegeOutputTxt + " DOES NOT exist. Continuing generating report.");
        }

        PrintWriter writerb = new PrintWriter("./Reports/collegeOutputTxt.txt", "UTF-8");
        DocumentBuilderFactory dbFactorya = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuildera = dbFactorya.newDocumentBuilder();
        Document doca = dBuildera.parse(collegeXmlFile);

        doca.getDocumentElement().normalize();

        NodeList nLista = doca.getElementsByTagName("college");

        writerb.println("-------------------------------------------");

        for (int temp = 0; temp < nLista.getLength(); temp++) {

            Node nNode = nLista.item(temp);

            writerb.println("\nCurrent Element :" + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                writerb.println("College id : " + eElement.getAttribute("id"));
                writerb.println("College name : " + eElement.getElementsByTagName("school").item(0).getTextContent());
                writerb.println("College mission : " + eElement.getElementsByTagName("mission").item(0).getTextContent());

                for (int i = 0; i < eElement.getElementsByTagName("department").getLength(); i++)
                {
                    writerb.println("Course department : " + eElement.getElementsByTagName("department").item(i).getTextContent());
                }

            }

            writerb.println("-------------------------------------------");

        }

        writerb.flush();
        writerb.close();
    }
}
