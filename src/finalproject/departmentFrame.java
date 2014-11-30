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
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Dalia
 */
public class departmentFrame extends JFrame{
    
    JFrame departmentFrame = new JFrame();
    
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
    
    String selection = null;
    NodeList college = null;
    
    public departmentFrame()
    {
        departmentFrame.setTitle("Department Input");
        departmentFrame.setSize(600,700);
        departmentFrame.setResizable( false );
        departmentFrame.setVisible(true);
        departmentFrame.setLocationRelativeTo(null);
        departmentFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        departmentFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                int confirm = JOptionPane.showOptionDialog(null, "Are You Sure to Close the Window?", "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                    departmentFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                }
            }
        });
        departmentFrame.setIconImage(image);
        departmentFrame.getContentPane().setBackground(utborange);
        
        String filepath = "colleges.xml";
        
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);
            
            college = doc.getElementsByTagName("school");
//            for (int i = 0; i < college.getLength(); i++) {
//                System.out.println(college.item(i).getTextContent());
//            }           
            
        } catch (ParserConfigurationException | IOException | SAXException pce) {
	   }      
        
        //JPanel p2 = new JPanel();
        departmentFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JComboBox list = new JComboBox();
        list.setPreferredSize(new Dimension(400, 30));
        for (int i = 0; i < college.getLength(); i++) {
            list.addItem(college.item(i).getTextContent());
        }
        list.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               selection = ((JComboBox)ae.getSource()).getSelectedItem().toString();
            }
            
        });    
        
        JLabel departmentName = new JLabel("Department Name:");
        departmentName.setPreferredSize(new Dimension(200, 30));
        
        JTextField departmentfield = new JTextField(30);
        departmentfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel departmentMission = new JLabel("Department Mission:");
        departmentMission.setPreferredSize(new Dimension(200, 30));
        
        JTextField departmentmissionfield = new JTextField(30);
        departmentmissionfield.setPreferredSize(new Dimension(300, 150));
        
        JLabel departmentVision = new JLabel("Department Vision:");
        departmentVision.setPreferredSize(new Dimension(200, 30));
        
        JTextField departmentvisionfield = new JTextField(30);
        departmentvisionfield.setPreferredSize(new Dimension(300, 150));
        
        JLabel departmentFacultyNumber = new JLabel("Number of Department's Faculty:");
        departmentFacultyNumber.setPreferredSize(new Dimension(200, 30));
        
        JTextField facultynumberfield = new JTextField(30);
        facultynumberfield.setPreferredSize(new Dimension(300, 30));
        
        JLabel departmentBackground = new JLabel("Department Background:");
        departmentBackground.setPreferredSize(new Dimension(200, 30));
        
        JTextField departmentbackgroundfield = new JTextField(30);
        departmentbackgroundfield.setPreferredSize(new Dimension(300, 150));
        
        //JLabel departmentCVFile = new JLabel("Department CV File:");
        //departmentCVFile.setPreferredSize(new Dimension(200, 30));
        
        //JTextField departmentcvfilefield = new JTextField(30);
        //departmentcvfilefield.setPreferredSize(new Dimension(300, 30));
        
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
                departmentFrame.dispose();

            }
        });
        
        departmentFrame.add(list);
        departmentFrame.add(departmentName);
        departmentFrame.add(departmentfield);
        departmentFrame.add(departmentMission);
        departmentFrame.add(departmentmissionfield);
        departmentFrame.add(departmentVision);
        departmentFrame.add(departmentvisionfield);
        departmentFrame.add(departmentFacultyNumber);
        departmentFrame.add(facultynumberfield);
        departmentFrame.add(departmentBackground);
        departmentFrame.add(departmentbackgroundfield);
        //departmentFrame.add(departmentCVFile);
        //departmentFrame.add(departmentcvfilefield);
        
        departmentFrame.add(addButton);
        departmentFrame.add(deleteButton);
        departmentFrame.add(saveButton);
        departmentFrame.add(cancelButton);
    //p1.setMaximumSize(new Dimension(50, 50));
    //p1.setBackground(utborange2);
    //p1.setBorder(myBorder2);
        //add(p2, BorderLayout.CENTER);
    }
}
