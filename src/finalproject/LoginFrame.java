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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Dalia
 */
public class LoginFrame extends JFrame{
    JFrame login = new JFrame();
    ImageIcon utblogo = new ImageIcon(getClass().getResource("/images/utblogo.png"));
    JLabel utblabel = new JLabel(utblogo);
    JButton loginbutton = new JButton("Login");
    
    public LoginFrame()
    {
        login.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        login.setTitle("User Login");
        login.setSize(250, 400);
        login.setResizable( false );
        login.setVisible(true);
        login.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE);
        
        login.add(utblabel);
        utblabel.setPreferredSize(new Dimension(250, 125));
        
        JLabel email = new JLabel("Email Address", SwingConstants.CENTER);
        email.setPreferredSize(new Dimension(250, 30));
        
        JTextField emailfield = new JTextField(20);
        emailfield.setPreferredSize(new Dimension(250, 30));
        
        JLabel password = new JLabel("Password", SwingConstants.CENTER);
        password.setPreferredSize(new Dimension(250, 30));
        
        JTextField passwordfield = new JTextField(20);
        passwordfield.setPreferredSize(new Dimension(250, 30));
        
        login.add(email);
        login.add(emailfield);
        login.add(password);
        login.add(passwordfield);
        login.add(loginbutton);
        
        loginbutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                login.dispose();
                //new application();
            }
        });
    }
}
