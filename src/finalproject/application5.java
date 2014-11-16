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
public class application5 {
    reportFrame frame5 = new reportFrame();
        
        public application5(){
        frame5.setTitle("Report Wizard");
        frame5.setSize(200,300);
        frame5.setResizable( false );
        frame5.setVisible(true);
        frame5.setDefaultCloseOperation(reportFrame.EXIT_ON_CLOSE);
        }
}
