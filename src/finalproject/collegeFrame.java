/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Dalia
 */
public class collegeFrame extends JFrame{
    public collegeFrame()
    {

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
        
        JButton inputButton = new JButton("input");
        
        add(collegeName);
        add(collegefield);
        add(collegeMission);
        add(missionfield);
        add(collegeVision);
        add(visionfield);
        add(inputButton);
    }
    
}
