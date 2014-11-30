/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.File;
import java.io.FileOutputStream;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author jesus
 */
public class reportGeneratorpdf {
    
    File courseXmlFile = new File("./courses.xml");
    File collegeXmlFile = new File("./colleges.xml");
    File courseOutputpdf = new File("./Reports/courseOutputpdf.txt");
    File collegeOutputpdf = new File("./Reports/collegeOutputpdf.txt");
    
    public void startreportGenerator() {

        if (courseOutputpdf.exists()) {
            boolean delete = courseOutputpdf.delete();
            if (delete) {
                System.out.println("File " + courseOutputpdf + " has been regenerated.");

            } else {
                System.out.println("Error! Deleting File " + courseOutputpdf + " .");
            }
        } else {
            System.out.println("File " + courseOutputpdf + " DOES NOT exist. Continuing generating report.");
        }
        
//        TransformerFactory tFactory = TransformerFactory.newInstance();
//        Transformer transformer = tFactory.newTransformer(new StreamSource("sample.xsl"));
//        transformer.transform(new StreamSource("sample.xml"),new StreamResult(new FileOutputStream("./Reports/courseOutputhtml.html")));
//        String File_To_Convert = "sample.html";
//        String url = new File(File_To_Convert).toURI().toURL().toString();
//        System.out.println(""+url);
//        String HTML_TO_PDF = "ConvertedFile.pdf";
//        OutputStream os = new FileOutputStream(HTML_TO_PDF);       
//        ITextRenderer renderer = new ITextRenderer();
//        renderer.setDocument(url);      
//        renderer.layout();
//        renderer.createPDF(os);        
//        os.close();
        

    }
    
}
