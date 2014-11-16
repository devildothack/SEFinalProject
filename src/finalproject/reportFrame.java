/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Dalia
 */
public class reportFrame extends JFrame{
    public reportFrame()
    {
        //JPanel p2 = new JPanel();
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        JLabel reportText = new JLabel("Report Generator");
        reportText.setPreferredSize(new Dimension(150, 30));
        
        JCheckBox textCheckBox = new JCheckBox("Text File Report");
        textCheckBox.setPreferredSize(new Dimension(150, 30));
        textCheckBox.setSelected(false);
        
        JCheckBox xmlCheckBox = new JCheckBox("XML File Report");
        xmlCheckBox.setPreferredSize(new Dimension(150, 30));
        xmlCheckBox.setSelected(false);
        
        JCheckBox pdfCheckBox = new JCheckBox("PDF File Report");
        pdfCheckBox.setPreferredSize(new Dimension(150, 30));
        pdfCheckBox.setSelected(false);
        
        JButton doReportButton = new JButton("Do Report");
        
        add(reportText);
        add(textCheckBox);
        add(xmlCheckBox);
        add(pdfCheckBox);
        add(doReportButton);
    }
}
