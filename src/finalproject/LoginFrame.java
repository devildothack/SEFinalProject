/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Dalia
 */
public class loginFrame extends JFrame {
    JFrame login = new JFrame();
    ImageIcon utblogo = new ImageIcon(getClass().getResource("/images/utblogo2.gif"));
    JLabel utblabel = new JLabel(utblogo);
    JButton loginbutton = new JButton("Login");
    
    public loginFrame()
    {
        login.setLayout(new GridLayout(6, 1));
        login.setTitle("Login");
        login.setSize(300, 400);
        login.setVisible(true);
        login.add(utblabel);
        JLabel email = new JLabel("Email Address");
        email.setPreferredSize(new Dimension(100, 10));
        JTextField emailfield = new JTextField(30);
        emailfield.setPreferredSize(new Dimension(100, 10));
        JLabel password = new JLabel("Password");
        password.setPreferredSize(new Dimension(100, 10));
        JTextField passwordfield = new JTextField(30);
        passwordfield.setPreferredSize(new Dimension(100, 10));
        login.add(email);
        login.add(emailfield);
        login.add(password);
        login.add(passwordfield);
        login.add(loginbutton);
        loginbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                login.dispose();
                new application();
            }
        });
    }
}
