package src.main;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

    public GamePanel() {

    }

    public void paintComponent(Graphics g) {
        // Calling a super class (JPanel) paintComponent method
        super.paintComponent(g);

        g.fillRect(100, 100, 200, 50);
    }
}
