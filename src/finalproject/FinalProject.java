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

        /* Call xml generator JJ */
<<<<<<< HEAD
//        CoursesXml cxml = new CoursesXml();
//        cxml.writeXml();
//
//        //*Call the function to enter data by the user
//        userInput myUserInput = new userInput();
//        
//        myUserInput.userInputRun();
=======
        CoursesXml cxml = new CoursesXml();
        cxml.writeXml();
                

        //*Call the function to enter data by the user
        userInput myUserInput = new userInput();
>>>>>>> origin/master
        
        CollegesXml d = new CollegesXml();
        d.writeXml();
 

        //Create the GUI interface, User Login Window. -DO
        new LoginFrame();
    }

}
