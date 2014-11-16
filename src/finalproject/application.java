/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

/**
 *
 * @author Dalia
 */
public class application {
        MyFrame frame = new MyFrame();
        
        public application(){
        frame.setTitle("University of Texas at Brownsville");
        frame.setSize(900, 700);
        frame.setResizable( false );
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(
        MyFrame.EXIT_ON_CLOSE);
        }
    
}
