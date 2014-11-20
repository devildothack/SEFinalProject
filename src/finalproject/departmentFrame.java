/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Dalia
 */
public class departmentFrame extends JFrame{
    public departmentFrame()
    {
        //JPanel p2 = new JPanel();
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JLabel departmentName = new JLabel("Department Name:");
        departmentName.setPreferredSize(new Dimension(200, 30));
        
        JTextField departmentfield = new JTextField(30);
        departmentfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel departmentMission = new JLabel("Department Mission:");
        departmentMission.setPreferredSize(new Dimension(200, 30));
        
        JTextField departmentmissionfield = new JTextField(30);
        departmentmissionfield.setPreferredSize(new Dimension(300, 150));
        
        JLabel departmentVision = new JLabel("Department Vision:");
        departmentVision.setPreferredSize(new Dimension(200, 30));
        
        JTextField departmentvisionfield = new JTextField(30);
        departmentvisionfield.setPreferredSize(new Dimension(300, 150));
        
        JLabel departmentFacultyNumber = new JLabel("Number of Department's Faculty:");
        departmentFacultyNumber.setPreferredSize(new Dimension(200, 30));
        
        JTextField facultynumberfield = new JTextField(30);
        facultynumberfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel departmentBackground = new JLabel("Department Background:");
        departmentBackground.setPreferredSize(new Dimension(200, 30));
        
        JTextField departmentbackgroundfield = new JTextField(30);
        departmentbackgroundfield.setPreferredSize(new Dimension(300, 150));
        
        JLabel departmentCVFile = new JLabel("Department CV File:");
        departmentCVFile.setPreferredSize(new Dimension(200, 30));
        
        JTextField departmentcvfilefield = new JTextField(30);
        departmentcvfilefield.setPreferredSize(new Dimension(300, 30));
        
        JButton saveButton = new JButton("save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

  

            }
        });
        
        JButton cancelButton = new JButton("cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                //setVisible(false);
                dispose();

            }
        });
        
        add(departmentName);
        add(departmentfield);
        add(departmentMission);
        add(departmentmissionfield);
        add(departmentVision);
        add(departmentvisionfield);
        add(departmentFacultyNumber);
        add(facultynumberfield);
        add(departmentBackground);
        add(departmentbackgroundfield);
        add(departmentCVFile);
        add(departmentcvfilefield);
        add(saveButton);
        add(cancelButton);
    //p1.setMaximumSize(new Dimension(50, 50));
    //p1.setBackground(utborange2);
    //p1.setBorder(myBorder2);
        //add(p2, BorderLayout.CENTER);
    }
}
