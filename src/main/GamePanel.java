package src.main;

import java.awt.Graphics;

import javax.swing.JPanel;

import src.inputs.KeyboardInputs;
import src.inputs.MouseInputs;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;

    // Holds our curr mouse cordinates
    private int xDelta = 100, yDelta = 100;

    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value) {
        this.xDelta += value;
        repaint();
    }

    public void changeYDelta(int value) {
        this.yDelta += value;
        repaint();
    }

    public void setRectPosition(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    public void paintComponent(Graphics g) {
        // Calling a super class (JPanel) paintComponent method
        super.paintComponent(g);

        g.fillRect(xDelta, yDelta, 200, 50);
    }
}
