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
public class courseFrame extends JFrame{
    public courseFrame()
    {
        //JPanel p2 = new JPanel();
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JLabel coursePrefix = new JLabel("Course Prefix:");
        coursePrefix.setPreferredSize(new Dimension(100, 30));
        
        JTextField courseprefixfield = new JTextField(30);
        courseprefixfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel courseNumber = new JLabel("Course Number:");
        courseNumber.setPreferredSize(new Dimension(100, 30));
        
        JTextField coursefumberfield = new JTextField(30);
        coursefumberfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel courseName = new JLabel("Course Full Name:");
        courseName.setPreferredSize(new Dimension(100, 30));
        
        JTextField coursenamefield = new JTextField(30);
        coursenamefield.setPreferredSize(new Dimension(300, 30));
        
        JLabel courseHours = new JLabel("Course Hours:");
        courseHours.setPreferredSize(new Dimension(100, 30));
        
        JTextField coursehoursfield = new JTextField(30);
        coursehoursfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel courseDescription = new JLabel("Course Description:");
        courseDescription.setPreferredSize(new Dimension(100, 30));
        
        JTextField coursedescriptionfield = new JTextField(30);
        coursedescriptionfield.setPreferredSize(new Dimension(300, 175));
        
        JButton saveButton = new JButton("save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

  

            }
        });
        
        JButton cancelButton = new JButton("cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                //setVisible(false);
                dispose();

            }
        });
        
        add(coursePrefix);
        add(courseprefixfield);
        add(courseNumber);
        add(coursefumberfield);
        add(courseName);
        add(coursenamefield);
        add(courseHours);
        add(coursehoursfield);
        add(courseDescription);
        add(coursedescriptionfield);
        add(saveButton);
        add(cancelButton);
    //p1.setMaximumSize(new Dimension(50, 50));
    //p1.setBackground(utborange2);
    //p1.setBorder(myBorder2);
        //add(p2, BorderLayout.CENTER);
    }
}
