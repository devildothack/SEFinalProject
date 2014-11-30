/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.File;

/**
 *
 * @author jesus
 */
public class reportGeneratorxml {
    
    File courseXmlFile = new File("./courses.xml");
    File collegeXmlFile = new File("./colleges.xml");
    File courseOutputxml = new File("./Reports/courseOutputxml.txt");
    File collegeOutputxml = new File("./Reports/collegeOutputxml.txt");
    
    public void startreportGenerator()
    {
            if (courseOutputxml.exists()) {
            boolean delete = courseOutputxml.delete();
            if (delete) {
                System.out.println("File " + courseOutputxml + " has been regenerated.");

            } else {
                System.out.println("Error! Deleting File " + courseOutputxml + " .");
            }
        } else {
            System.out.println("File " + courseOutputxml + " DOES NOT exist. Continuing generating report.");
        }
            
        
        
    }
    
}
