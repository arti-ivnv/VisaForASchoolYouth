package src.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameWindow {

    private JFrame jFrame;

    public GameWindow(GamePanel gamePanel) {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.pack();
        jFrame.setResizable(false);
        // Should be at the buttom
        jFrame.setVisible(true);

    }
}
