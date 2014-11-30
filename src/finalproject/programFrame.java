/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.awt.BorderLayout;
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Dalia
 */
public class programFrame extends JFrame{
    
    JFrame programFrame = new JFrame();
    
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
    
    public programFrame()
    {
        programFrame.setTitle("Program Input");
        programFrame.setSize(800,700);
        programFrame.setResizable( false );
        programFrame.setVisible(true);
        programFrame.setLocationRelativeTo(null);
        programFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        programFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                int confirm = JOptionPane.showOptionDialog(null, "Are You Sure to Close the Window?", "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                    programFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                }
            }
        });
        programFrame.getContentPane().setBackground(utborange);
        programFrame.setIconImage(image);
        //JPanel p2 = new JPanel();
        //programFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setPreferredSize(new Dimension(400, 600));
        //p1.setMaximumSize(new Dimension(400, 600));
        p1.setBackground(utborange);
        //p1.setBorder(myBorder);
        
        JLabel programName = new JLabel("Program Name:");
        programName.setPreferredSize(new Dimension(100, 30));
        
        JTextField programfield = new JTextField(30);
        programfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel degree = new JLabel("Degree:");
        degree.setPreferredSize(new Dimension(100, 30));
        
        JTextField degreefield = new JTextField(30);
        degreefield.setPreferredSize(new Dimension(300, 30));
        
        JLabel labs = new JLabel("Labs:");
        labs.setPreferredSize(new Dimension(100, 30));
        
        JTextField labsfield = new JTextField(30);
        labsfield.setPreferredSize(new Dimension(300, 150));
        
        JLabel equipment = new JLabel("Equipment:");
        equipment.setPreferredSize(new Dimension(100, 30));
        
        JTextField equipmentfield = new JTextField(30);
        equipmentfield.setPreferredSize(new Dimension(300, 150));
        
        p1.add(programName);
        p1.add(programfield);
        p1.add(degree);
        p1.add(degreefield);
        p1.add(labs);
        p1.add(labsfield);
        p1.add(equipment);
        p1.add(equipmentfield);
        p1.setBorder(new TitledBorder("Program Information"));
        
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.setPreferredSize(new Dimension(400, 600));
        p2.setBackground(utborange);
        
        
        JLabel studentNum = new JLabel("Number of Students in Program:");
        studentNum.setPreferredSize(new Dimension(200, 30));
        
        JTextField studentnumfield = new JTextField(30);
        studentnumfield.setPreferredSize(new Dimension(50, 30));
        
        JLabel studentRank = new JLabel("Student Rank:");
        studentRank.setPreferredSize(new Dimension(200, 30));
        
        JTextField studentrankfield = new JTextField(30);
        studentrankfield.setPreferredSize(new Dimension(50, 30));
        
        JLabel studentGender = new JLabel("Student Gender:");
        studentGender.setPreferredSize(new Dimension(200, 30));
        
        JTextField studengenderfield = new JTextField(30);
        studengenderfield.setPreferredSize(new Dimension(50, 30));
        
        JLabel studentEthnic = new JLabel("Student Ethnic:");
        studentEthnic.setPreferredSize(new Dimension(200, 30));
        
        JTextField studenethnicfield = new JTextField(30);
        studenethnicfield.setPreferredSize(new Dimension(50, 30));
        
        JLabel studentAge = new JLabel("Student Age:");
        studentAge.setPreferredSize(new Dimension(200, 30));
        
        JTextField studentagefield = new JTextField(30);
        studentagefield.setPreferredSize(new Dimension(50, 30));
        
        JLabel studentOutcomes = new JLabel("Student Learning Outcomes:");
        studentOutcomes.setPreferredSize(new Dimension(200, 30));
        
        JTextField studentoutcomesfield = new JTextField(30);
        studentoutcomesfield.setPreferredSize(new Dimension(50, 150));
        
        
        p2.add(studentNum);
        p2.add(studentnumfield);
        p2.add(studentRank);
        p2.add(studentrankfield);
        p2.add(studentGender);
        p2.add(studengenderfield);
        p2.add(studentEthnic);
        p2.add(studenethnicfield);
        p2.add(studentAge);
        p2.add(studentagefield);
        p2.add(studentOutcomes);
        p2.add(studentoutcomesfield);
        p2.setBorder(new TitledBorder("Student Statistics"));
        
        
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.setPreferredSize(new Dimension(800, 100));
        p3.setBackground(utborange);
        
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
                programFrame.dispose();

            }
        });
        
        p3.add(addButton);
        p3.add(deleteButton);
        p3.add(saveButton);
        p3.add(cancelButton);
        
//        programFrame.add(programName);
//        programFrame.add(programfield);
//        programFrame.add(degree);
//        programFrame.add(degreefield);
//        programFrame.add(labs);
//        programFrame.add(labsfield);
//        programFrame.add(equipment);
//        programFrame.add(equipmentfield);
//        programFrame.add(studentNum);
//        programFrame.add(studentnumfield);
//        programFrame.add(studentRank);
//        programFrame.add(studentrankfield);
//        programFrame.add(studentGender);
//        programFrame.add(studengenderfield);
//        programFrame.add(studentEthnic);
//        programFrame.add(studenethnicfield);
//        programFrame.add(studentAge);
//        programFrame.add(studentagefield);
//        programFrame.add(studentOutcomes);
//        programFrame.add(studentoutcomesfield);
//        
//        
//        programFrame.add(saveButton);
//        programFrame.add(cancelButton);
        
        programFrame.add(p1, BorderLayout.WEST);
        programFrame.add(p2, BorderLayout.EAST);
        programFrame.add(p3, BorderLayout.SOUTH);
    }
    
}
