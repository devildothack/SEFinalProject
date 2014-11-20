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
public class inputFrame extends JFrame {
    
    
    
    public inputFrame()
    {
        //JPanel p2 = new JPanel();
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JLabel collegeName = new JLabel("College Name:");
        collegeName.setPreferredSize(new Dimension(100, 30));
        
        JTextField collegefield = new JTextField(30);
        collegefield.setPreferredSize(new Dimension(300, 30));
        
        JLabel collegeMission = new JLabel("College Mission:");
        collegeMission.setPreferredSize(new Dimension(100, 30));
        
        JTextField missionfield = new JTextField(30);
        missionfield.setPreferredSize(new Dimension(300, 175));
        
        JLabel collegeVision = new JLabel("College Vision:");
        collegeVision.setPreferredSize(new Dimension(100, 30));
        
        JTextField visionfield = new JTextField(30);
        visionfield.setPreferredSize(new Dimension(300, 175));
        
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
        
        add(collegeName);
        add(collegefield);
        add(collegeMission);
        add(missionfield);
        add(collegeVision);
        add(visionfield);
        add(saveButton);
        add(cancelButton);
    //p1.setMaximumSize(new Dimension(50, 50));
    //p1.setBackground(utborange2);
    //p1.setBorder(myBorder2);
        //add(p2, BorderLayout.CENTER);
    }
    
}
