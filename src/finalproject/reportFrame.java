/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Dalia
 */
public class reportFrame extends JFrame {

    JFrame reportFrame = new JFrame();

    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/SElogo25px.png"));

    Color utborange = new Color(182, 101, 19);
    Color utborange2 = new Color(229, 157, 84);
    Color utbblue = new Color(0, 58, 99);
    

    public reportFrame() {
        reportFrame.setTitle("Report Wizard");
        reportFrame.setSize(200, 300);
        reportFrame.setResizable(false);
        reportFrame.setVisible(true);
        reportFrame.setLocationRelativeTo(null);
        reportFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reportFrame.setIconImage(image);
        reportFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        reportFrame.getContentPane().setBackground(utborange);

        JLabel reportText = new JLabel("Report Generator", SwingConstants.CENTER);
        reportText.setPreferredSize(new Dimension(150, 30));

        final JRadioButton xmlCheckBox = new JRadioButton("XML Report");
        final JRadioButton pdfCheckBox = new JRadioButton("PDF Report");
        final JRadioButton textCheckBox = new JRadioButton("Plain Text Report");
        
        ButtonGroup reportGroup = new ButtonGroup();

        reportGroup.add(pdfCheckBox);
        reportGroup.add(xmlCheckBox);
        reportGroup.add(textCheckBox);

        JButton cancelButton = new JButton("Cancel");
        JButton doReportButton = new JButton("Do Report");
        JButton openDir = new JButton("Open Reports");
        
        reportFrame.add(reportText);
        reportFrame.add(xmlCheckBox);
        reportFrame.add(pdfCheckBox);
        reportFrame.add(textCheckBox);
        reportFrame.add(doReportButton);
        reportFrame.add(cancelButton);
        reportFrame.add(openDir);
        
        reportFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        reportFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                int confirm = JOptionPane.showOptionDialog(null, "Are You Sure to Close the Window?", "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                    reportFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                }
            }});

        doReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (xmlCheckBox.isSelected()) {
                    

                } else if (pdfCheckBox.isSelected()) {

                } else if (textCheckBox.isSelected()) {
                    reportGeneratortxt txtReport = new reportGeneratortxt();
                    try {
                        txtReport.startreportGenerator();
                        
                    } catch (ParserConfigurationException | SAXException | IOException ex) {
                        Logger.getLogger(reportFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                else {
                    Component frame = null;
                    JOptionPane.showMessageDialog(frame, "Error! Nothing is selected.");
                }

            }
        });

        cancelButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                reportFrame.setVisible(false);
                dispose();
            }
        });
        
        openDir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                File foler = new File("./Reports/");
                Desktop desktop = null;
                if (Desktop.isDesktopSupported()) {
                    desktop = Desktop.getDesktop();

                }

                try {
                    desktop.open(foler);
                } catch (IOException c) {
                    System.out.println(e);
                }

            }
        } 
        
        
        
        
        );
        
    }
}
