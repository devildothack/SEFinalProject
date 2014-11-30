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

    private final int duration;

    public SplashScreen(int d) {
        duration = d;
    }

    public void runSplash() {
        JPanel content = (JPanel) getContentPane();
        ImageIcon content2 = new ImageIcon(getClass().getResource("/images/projlogo2.gif"));
        AWTUtilities.setWindowOpaque(this, false);

        
        int width = 450;
        int height = 450;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);

        JLabel label = new JLabel(content2);
        content.add(label, BorderLayout.CENTER);
        setVisible(true);

        try {
            Thread.sleep(duration);
            this.dispose();
            loginFrame login = new loginFrame();
            login.loginFrameRun();
        } catch (Exception e) {
        }
        setVisible(false);
    }
    
}
