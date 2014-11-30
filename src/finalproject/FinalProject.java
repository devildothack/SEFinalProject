/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;


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

        //Create local XML database - Jesus J.
        CoursesXml cxml = new CoursesXml();
        CollegesXml collegexml = new CollegesXml();
        FacultyXml facultyxml = new FacultyXml();
        cxml.writeXml();
        collegexml.writeXml();
        
        //Accept user inputs for data - Jesus V.
//        userInput inputData = new userInput();
//        inputData.userInputRun();
        
        //Creates the login/splash screen -Sandra
        SplashScreen splash = new SplashScreen(10000);
        splash.runSplash();
        
    }

}
