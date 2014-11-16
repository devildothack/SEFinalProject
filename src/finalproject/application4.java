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
public class application4 {
    courseFrame frame4 = new courseFrame();
        
        public application4(){
        frame4.setTitle("Course Input");
        frame4.setSize(500,400);
        frame4.setResizable( false );
        frame4.setVisible(true);
        frame4.setDefaultCloseOperation(courseFrame.EXIT_ON_CLOSE);
        }
}
