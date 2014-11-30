/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.SwingConstants;

/**
 *
 * @author Dalia
 */
public class loginFrame extends JFrame {
    JFrame login = new JFrame();
    
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/SElogo25px.png"));
    ImageIcon utblogo = new ImageIcon(getClass().getResource("/images/utbwhitelogo.png"));
    
    ImageIcon loginbtn = new ImageIcon(getClass().getResource("/images/login.png"));
    ImageIcon loginbtnr = new ImageIcon(getClass().getResource("/images/loginr.png"));
    ImageIcon loginbtnp = new ImageIcon(getClass().getResource("/images/loginp.png"));
    
    Color utborange = new Color(182, 101, 19);
    Color utborange2 = new Color(229, 157, 84);
    Color utbblue = new Color(0, 58, 99);
    
    public void loginFrameRun()
    {
        
        login.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        login.setTitle("User Login");
        login.setSize(250, 400);
        login.setResizable( false );
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        login.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                int confirm = JOptionPane.showOptionDialog(null, "Are You Sure to Close Application?", "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                    System.exit(0);
                }
            }
        });
        
        login.setIconImage(image);
        login.getContentPane().setBackground(utborange);
        
        JLabel utblabel = new JLabel(utblogo);
        utblabel.setPreferredSize(new Dimension(250, 125));
        
        JLabel email = new JLabel("Username", SwingConstants.CENTER);
        email.setPreferredSize(new Dimension(250, 30));
        
        final JTextField emailfield = new JTextField(20);
        emailfield.setPreferredSize(new Dimension(250, 30));
        
        JLabel password = new JLabel("Password", SwingConstants.CENTER);
        password.setPreferredSize(new Dimension(250, 30));
        
        final JTextField passwordfield = new JTextField(20);
        passwordfield.setPreferredSize(new Dimension(250, 30));
        
        JButton loginbutton = new JButton(loginbtn);
        loginbutton.setBorderPainted(false);
        loginbutton.setContentAreaFilled(false);
        loginbutton.setFocusPainted(false);
        loginbutton.setOpaque(false);
        loginbutton.setPressedIcon(loginbtnp);
        loginbutton.setRolloverIcon(loginbtnr);
        loginbutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
 
                if (emailfield.getText().equals("admin") && passwordfield.getText().equals("123"))
                {
                    login.dispose();
                    MyFrame myFrame = new MyFrame();
                }
                else if (emailfield.getText().equals("admin"))
                {
                    Component frame = null;
                    JOptionPane.showMessageDialog(frame, "Error! Wrong password");
                    
                }
                else if (passwordfield.getText().equals("123"))
                {
                    Component frame = null;
                    JOptionPane.showMessageDialog(frame, "Error! Wrong username");
                }
                else
                {
                    Component frame = null;
                    JOptionPane.showMessageDialog(frame, "Error! Wrong credentials.");
                }
                        
            }
        });
        
        login.add(utblabel);
        login.add(email);
        login.add(emailfield);
        login.add(password);
        login.add(passwordfield);
        login.add(loginbutton);
    }
}

