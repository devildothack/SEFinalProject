/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Dalia
 */
public class courseFrame extends JFrame{
    
    JFrame courseFrame = new JFrame();
    
    ImageIcon addbtn = new ImageIcon(getClass().getResource("/images/add.png"));
    ImageIcon addrbtn = new ImageIcon(getClass().getResource("/images/addr.png"));
    ImageIcon addpbtn = new ImageIcon(getClass().getResource("/images/addp.png"));
    
    ImageIcon deletebtn = new ImageIcon(getClass().getResource("/images/delete.png"));
    ImageIcon deleterbtn = new ImageIcon(getClass().getResource("/images/deleter.png"));
    ImageIcon deletepbtn = new ImageIcon(getClass().getResource("/images/deletep.png"));
    
    ImageIcon savebtn = new ImageIcon(getClass().getResource("/images/save.png"));
    ImageIcon saverbtn = new ImageIcon(getClass().getResource("/images/saver.png"));
    ImageIcon savepbtn = new ImageIcon(getClass().getResource("/images/savep.png"));
    
    ImageIcon cancelbtn = new ImageIcon(getClass().getResource("/images/cancel.png"));
    ImageIcon cancelrbtn = new ImageIcon(getClass().getResource("/images/cancelr.png"));
    ImageIcon cancelpbtn = new ImageIcon(getClass().getResource("/images/cancelp.png"));
    
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/SElogo25px.png"));
    
    Color utborange = new Color(182, 101, 19);
    Color utborange2 = new Color(229, 157, 84);
    Color utbblue = new Color(0, 58, 99);
    
    public courseFrame()
    {
        courseFrame.setTitle("Course Input");
        courseFrame.setSize(600,600);
        courseFrame.setResizable( false );
        courseFrame.setVisible(true);
        courseFrame.setLocationRelativeTo(null);
        courseFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        courseFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                int confirm = JOptionPane.showOptionDialog(null, "Are You Sure to Close the Window?", "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                    courseFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                }
            }
        });
        courseFrame.setIconImage(image);
        //JPanel p2 = new JPanel();
        courseFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        courseFrame.getContentPane().setBackground(utborange);
        
       
        
        JLabel coursePrefix = new JLabel("Course Prefix:");
        coursePrefix.setPreferredSize(new Dimension(150, 30));
        
        JTextField courseprefixfield = new JTextField(30);
        courseprefixfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel courseNumber = new JLabel("Course Number:");
        courseNumber.setPreferredSize(new Dimension(150, 30));
        
        JTextField coursefumberfield = new JTextField(30);
        coursefumberfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel courseHours = new JLabel("Course Hours:");
        courseHours.setPreferredSize(new Dimension(150, 30));
        
        JTextField coursehoursfield = new JTextField(30);
        coursehoursfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel courseName = new JLabel("Course Full Name:");
        courseName.setPreferredSize(new Dimension(150, 30));
        
        JTextField coursenamefield = new JTextField(30);
        coursenamefield.setPreferredSize(new Dimension(300, 30));
        
        JLabel courseDescription = new JLabel("Course Description:");
        courseDescription.setPreferredSize(new Dimension(150, 30));
        
        JTextField coursedescriptionfield = new JTextField(30);
        coursedescriptionfield.setPreferredSize(new Dimension(300, 175));
        
        JLabel coursePrerequisites = new JLabel("Course Prerequisites:");
        coursePrerequisites.setPreferredSize(new Dimension(150, 30));
        
        JTextField courseprerequisitesfield = new JTextField(30);
        courseprerequisitesfield.setPreferredSize(new Dimension(300, 175));
        
        JButton saveButton = new JButton(savebtn);
        saveButton.setBorderPainted(false);
        saveButton.setContentAreaFilled(false);
        saveButton.setFocusPainted(false);
        saveButton.setOpaque(false);
        saveButton.setPressedIcon(savepbtn);
        saveButton.setRolloverIcon(saverbtn);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

  

            }
        });
        
        JButton addButton = new JButton(addbtn);
        addButton.setBorderPainted(false);
        addButton.setContentAreaFilled(false);
        addButton.setFocusPainted(false);
        addButton.setOpaque(false);
        addButton.setPressedIcon(addpbtn);
        addButton.setRolloverIcon(addrbtn);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

  

            }
        });
        
        JButton deleteButton = new JButton(deletebtn);
        deleteButton.setBorderPainted(false);
        deleteButton.setContentAreaFilled(false);
        deleteButton.setFocusPainted(false);
        deleteButton.setOpaque(false);
        deleteButton.setPressedIcon(deletepbtn);
        deleteButton.setRolloverIcon(deleterbtn);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

  

            }
        });
        
        JButton cancelButton = new JButton(cancelbtn);
        cancelButton.setBorderPainted(false);
        cancelButton.setContentAreaFilled(false);
        cancelButton.setFocusPainted(false);
        cancelButton.setOpaque(false);
        cancelButton.setPressedIcon(cancelpbtn);
        cancelButton.setRolloverIcon(cancelrbtn);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                //setVisible(false);
                courseFrame.dispose();

            }
        });
        
        
        courseFrame.add(coursePrefix);
        courseFrame.add(courseprefixfield);
        courseFrame.add(courseNumber);
        courseFrame.add(coursefumberfield);
        courseFrame.add(courseHours);
        courseFrame.add(coursehoursfield);
        courseFrame.add(courseName);
        courseFrame.add(coursenamefield);
        courseFrame.add(courseDescription);
        courseFrame.add(coursedescriptionfield);
        courseFrame.add(coursePrerequisites);
        courseFrame.add(courseprerequisitesfield);
        
        courseFrame.add(addButton);
        courseFrame.add(deleteButton);
        courseFrame.add(saveButton);
        courseFrame.add(cancelButton);
    //p1.setMaximumSize(new Dimension(50, 50));
    //p1.setBackground(utborange2);
    //p1.setBorder(myBorder2);
        //add(p2, BorderLayout.CENTER);
    }
}
