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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author Dalia
 */
public class MyFrame extends JFrame {

    ImageIcon collegeinput = new ImageIcon(getClass().getResource("/images/collegeinput.png"));
    ImageIcon collegeinputp = new ImageIcon(getClass().getResource("/images/collegeinputp.png"));
    ImageIcon collegeinputr = new ImageIcon(getClass().getResource("/images/collegeinputr.png"));
    ImageIcon colleges = new ImageIcon(getClass().getResource("/images/colleges.png"));
    ImageIcon collegesp = new ImageIcon(getClass().getResource("/images/collegesp.png"));
    ImageIcon collegesr = new ImageIcon(getClass().getResource("/images/collegesr.png"));
    ImageIcon courseinput = new ImageIcon(getClass().getResource("/images/courseinput.png"));
    ImageIcon courseinputp = new ImageIcon(getClass().getResource("/images/courseinputp.png"));
    ImageIcon courseinputr = new ImageIcon(getClass().getResource("/images/courseinputr.png"));
    ImageIcon courses = new ImageIcon(getClass().getResource("/images/courses.png"));
    ImageIcon coursesp = new ImageIcon(getClass().getResource("/images/coursesp.png"));
    ImageIcon coursesr = new ImageIcon(getClass().getResource("/images/coursesr.png"));
    ImageIcon departmentinput = new ImageIcon(getClass().getResource("/images/departmentinput.png"));
    ImageIcon departmentinputp = new ImageIcon(getClass().getResource("/images/departmentinputp.png"));
    ImageIcon departmentinputr = new ImageIcon(getClass().getResource("/images/departmentinputr.png"));
    ImageIcon departments = new ImageIcon(getClass().getResource("/images/departments.png"));
    ImageIcon departmentsp = new ImageIcon(getClass().getResource("/images/departmentsp.png"));
    ImageIcon departmentsr = new ImageIcon(getClass().getResource("/images/departmentsr.png"));
    ImageIcon home = new ImageIcon(getClass().getResource("/images/home.png"));
    ImageIcon homep = new ImageIcon(getClass().getResource("/images/homep.png"));
    ImageIcon homer = new ImageIcon(getClass().getResource("/images/homer.png"));
    ImageIcon inputinfo = new ImageIcon(getClass().getResource("/images/inputinfo.png"));
    ImageIcon ocelot = new ImageIcon(getClass().getResource("/images/ocelot.png"));
    ImageIcon programs = new ImageIcon(getClass().getResource("/images/programs.png"));
    ImageIcon programsp = new ImageIcon(getClass().getResource("/images/programsp.png"));
    ImageIcon programsr = new ImageIcon(getClass().getResource("/images/programsr.png"));
    ImageIcon reportwizard = new ImageIcon(getClass().getResource("/images/reportwizard.png"));
    ImageIcon reportwizardp = new ImageIcon(getClass().getResource("/images/reportwizardp.png"));
    ImageIcon reportwizardr = new ImageIcon(getClass().getResource("/images/reportwizardr.png"));
    ImageIcon utblogo = new ImageIcon(getClass().getResource("/images/utblogo.png"));
    ImageIcon utbocelot = new ImageIcon(getClass().getResource("/images/utbocelot.png"));
    ImageIcon utbwhitelogo = new ImageIcon(getClass().getResource("/images/utbwhitelogo.png"));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/utblogo.png"));

    Color utborange = new Color(182, 101, 19);
    Color utborange2 = new Color(229, 157, 84);
    Color utbblue = new Color(0, 58, 99);
    Border myBorder = BorderFactory.createMatteBorder(0, 0, 3, 0, utbblue);
    Border myBorder2 = BorderFactory.createMatteBorder(3, 0, 0, 0, utbblue);
    Border myBorder3 = BorderFactory.createMatteBorder(0, 3, 0, 3, utbblue);

    public MyFrame() {
        setIconImage(image);

        //Banner Panel
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setPreferredSize(new Dimension(900, 150));
        p1.setBackground(utborange);
        p1.setBorder(myBorder);
        
        JLabel logo = new JLabel("University of Texas at Brownsville", utbwhitelogo, SwingConstants.CENTER);
        p1.add(logo);
        logo.setHorizontalTextPosition(SwingConstants.CENTER);
        logo.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        //Tree Panel
        JPanel p2 = new JPanel(new BorderLayout());
        p2.setLayout(new FlowLayout());
        p2.setPreferredSize(new Dimension(150, 450));
        p2.setBackground(utborange2);
        
        //Text Panel
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.setPreferredSize(new Dimension(600, 450));
        p3.setBackground(Color.GRAY);
        p3.setBorder(myBorder3);
        
        JTextArea textArea = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(580, 410));
        p3.add(scrollPane, BorderLayout.CENTER);

        //User Panel
        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        p4.setPreferredSize(new Dimension(150, 450));
        p4.setBackground(utborange2);
        
        JLabel userinput = new JLabel("User Input");
        
        JButton collegeinputbtn = new JButton(collegeinput);
        collegeinputbtn.setBorderPainted(false);
        collegeinputbtn.setContentAreaFilled(false);
        collegeinputbtn.setFocusPainted(false);
        collegeinputbtn.setOpaque(false);
        collegeinputbtn.setPressedIcon(collegeinputp);
        collegeinputbtn.setRolloverIcon(collegeinputr);
        collegeinputbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                new application2();

            }
        });
        
        JButton departmentinputbtn = new JButton(departmentinput);
        departmentinputbtn.setBorderPainted(false);
        departmentinputbtn.setContentAreaFilled(false);
        departmentinputbtn.setFocusPainted(false);
        departmentinputbtn.setOpaque(false);
        departmentinputbtn.setPressedIcon(departmentinputp);
        departmentinputbtn.setRolloverIcon(departmentinputr);
        departmentinputbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                new application3();

            }
        });
        
        JButton courseinputbtn = new JButton(courseinput);
        courseinputbtn.setBorderPainted(false);
        courseinputbtn.setContentAreaFilled(false);
        courseinputbtn.setFocusPainted(false);
        courseinputbtn.setOpaque(false);
        courseinputbtn.setPressedIcon(courseinputp);
        courseinputbtn.setRolloverIcon(courseinputr);
        courseinputbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                new application4();

            }
        });
        
        p4.add(userinput);
        p4.add(collegeinputbtn);
        p4.add(departmentinputbtn);
        p4.add(courseinputbtn);
        
        //Button Panel
        JPanel p5 = new JPanel();
        p5.setLayout(new FlowLayout());
        p5.setPreferredSize(new Dimension(900, 100));
        p5.setBackground(utborange);
        p5.setBorder(myBorder2);
        
        JButton homebtn = new JButton(home);
        homebtn.setBorderPainted(false);
        homebtn.setContentAreaFilled(false);
        homebtn.setFocusPainted(false);
        homebtn.setOpaque(false);
        homebtn.setPressedIcon(homep);
        homebtn.setRolloverIcon(homer);

        JButton collegesbtn = new JButton(colleges);
        collegesbtn.setBorderPainted(false);
        collegesbtn.setContentAreaFilled(false);
        collegesbtn.setFocusPainted(false);
        collegesbtn.setOpaque(false);
        collegesbtn.setPressedIcon(collegesp);
        collegesbtn.setRolloverIcon(collegesr);
        
        JButton departmentsbtn = new JButton(departments);
        departmentsbtn.setBorderPainted(false);
        departmentsbtn.setContentAreaFilled(false);
        departmentsbtn.setFocusPainted(false);
        departmentsbtn.setOpaque(false);
        departmentsbtn.setPressedIcon(departmentsp);
        departmentsbtn.setRolloverIcon(departmentsr);
        
        JButton programsbtn = new JButton(programs);
        programsbtn.setBorderPainted(false);
        programsbtn.setContentAreaFilled(false);
        programsbtn.setFocusPainted(false);
        programsbtn.setOpaque(false);
        programsbtn.setPressedIcon(programsp);
        programsbtn.setRolloverIcon(programsr);
        
        JButton coursesbtn = new JButton(courses);
        coursesbtn.setBorderPainted(false);
        coursesbtn.setContentAreaFilled(false);
        coursesbtn.setFocusPainted(false);
        coursesbtn.setOpaque(false);
        coursesbtn.setPressedIcon(coursesp);
        coursesbtn.setRolloverIcon(coursesr);

        JButton reportwizbtn = new JButton(reportwizard);
        reportwizbtn.setBorderPainted(false);
        reportwizbtn.setContentAreaFilled(false);
        reportwizbtn.setFocusPainted(false);
        reportwizbtn.setOpaque(false);
        reportwizbtn.setPressedIcon(reportwizardp);
        reportwizbtn.setRolloverIcon(reportwizardr);
        reportwizbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                new application5();

            }
        });

        p5.add(homebtn);
        p5.add(collegesbtn);
        p5.add(departmentsbtn);
        p5.add(programsbtn);
        p5.add(coursesbtn);
        p5.add(reportwizbtn);
        





        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.WEST);
        add(p3, BorderLayout.CENTER);
        add(p4, BorderLayout.EAST);
        add(p5, BorderLayout.SOUTH);
    }
}
