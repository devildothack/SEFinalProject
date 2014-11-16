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
public class application3 {
    departmentFrame frame3 = new departmentFrame();
        
        public application3(){
        frame3.setTitle("Department Input");
        frame3.setSize(600,700);
        frame3.setResizable( false );
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(departmentFrame.EXIT_ON_CLOSE);
        }
}
