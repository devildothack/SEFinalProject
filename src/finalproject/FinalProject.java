/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Final Project Test");
		System.out.println("Test Code :)");  //By JJ
                
        System.out.println("Second test"); //By JJ
	
	System.out.println("Diana's Test"); //By DO
        
        //JJ
        String prefix, number, name, hour, description, prerequisites;
        String nameUniv, missionUniv, visionUniv;
        Image logo = null;
        
        ArrayList dataList = new ArrayList();
        ArrayList dataListUniv = new ArrayList();
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Enter prefix, number, name, hour, description, prerequisites:");
        
        prefix = inputScanner.nextLine();
        number = inputScanner.nextLine();
        name = inputScanner.nextLine();
        hour = inputScanner.nextLine();
        description = inputScanner.nextLine();
        prerequisites = inputScanner.nextLine();
        
        Courses currentCourse = new Courses(prefix, number, name, hour, description, prerequisites);
        dataList.add(currentCourse);
        
        for (Object dataList1 : dataList) {
            System.out.println(currentCourse.getPrefix());
            System.out.println(currentCourse.getNumber());
            System.out.println(currentCourse.getName());
            System.out.println(currentCourse.getHour());
            System.out.println(currentCourse.getDescription());
            System.out.println(currentCourse.getPrerequisites());
        }
        
        System.out.println("Enter name, mission, vision");
        nameUniv = inputScanner.nextLine();
        missionUniv = inputScanner.nextLine();
        visionUniv = inputScanner.nextLine();
        
        University currentUniversity = new University(nameUniv, missionUniv, visionUniv, logo);
        dataListUniv.add(currentUniversity);
        
        for (Object dataListUniv1 : dataListUniv) {
            System.out.println(currentUniversity.getNameUniv());
            System.out.println(currentUniversity.getMissionUniv());
            System.out.println(currentUniversity.getVisionUniv());
            System.out.println(currentUniversity.getLogo());
        }
                
           
        
    }
    
}
