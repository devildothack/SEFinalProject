/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author nathaliab
 */
public class Entrada extends JFrame implements ActionListener {

    JFrame entrada = new JFrame();
    JLabel label = new JLabel("User Name: ");
    JLabel label2 = new JLabel("Password: ");
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JButton login = new JButton("Log in");
    JLabel status = new JLabel("Status:Not logged in");
    

    public Entrada() {

        super("Log in");
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("Log in Screen");

        //label.setForeground(Color.BLUE);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(Color.GRAY);
        label.setBounds(20, 10, 150, 30);
        getContentPane().add(label);
        
        username.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
        username.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        //username.setBackground(Color.ORANGE);
        //username.setForeground(Color.GRAY);
        username.setBounds(150, 10, 150, 30);
        getContentPane().add(username);

        //label2.setForeground(Color.BLUE);
        label2.setFont(new Font("Arial", Font.BOLD, 16));
        label2.setForeground(Color.GRAY);
        label2.setBounds(20, 60, 150, 30);
        getContentPane().add(label2);

        //password.setBackground(Color.ORANGE);
        //password.setForeground(Color.BLUE);
        password.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        password.setBounds(150, 60, 150, 30);
        getContentPane().add(password);

        login.setBounds(150, 100, 150, 30);
        login.setFont(new Font("Arial", Font.BOLD, 16));
        login.setBackground(Color.BLUE);
        login.setForeground(Color.WHITE);
        getContentPane().add(login);

        getContentPane().add(status);
        login.addActionListener(this);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (username.getText().equals("admin") && password.getText().equals("123")) {
            JOptionPane.showMessageDialog(null, "Logged in");
        } else {

            if (!username.getText().equals("admin")) {
                JOptionPane.showMessageDialog(null, "Username is incorrect");
            } else if (!password.getText().equals("123")) {
                JOptionPane.showMessageDialog(null, "Incorrect password");
            }

        }
       

    }

    
}
