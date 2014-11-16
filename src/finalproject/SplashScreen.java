/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import com.sun.awt.AWTUtilities;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author nathaliab
 */
public class SplashScreen extends JWindow {

    private int duration;

    public SplashScreen(int d) {
        duration = d;
    }

    public void showSplash() {
        JPanel content = (JPanel) getContentPane();
        ImageIcon content2 = new ImageIcon(getClass().getResource("/images/utbsplash.gif"));
        AWTUtilities.setWindowOpaque(this, false);

        
        int width = 450;
        int height = 450;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);

        JLabel label = new JLabel(content2);
        JLabel copyrt = new JLabel("Copyright 2014, UTB", JLabel.CENTER);
        copyrt.setFont(new Font("Arial", Font.BOLD, 12));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        setVisible(true);

        try {
            Thread.sleep(duration);
            this.dispose();
            new Entrada();
        } catch (Exception e) {
        }
        setVisible(false);
    }

    public void showSplashAndExit() {
        showSplash();

    }
}
