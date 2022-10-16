package src.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

import src.inputs.KeyboardInputs;
import src.inputs.MouseInputs;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;

    // Holds our curr mouse cordinates
    private float xDelta = 100, yDelta = 100;
    private float xDir = 0.9f, yDir = 0.9f;
    private long frames = 0;
    private Color color = new Color(150, 20, 90);
    private Random random;

    private long lastCheck;

    public GamePanel() {
        random = new Random();
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value) {
        this.xDelta += value;
    }

    public void changeYDelta(int value) {
        this.yDelta += value;
    }

    public void setRectPosition(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
    }

    public void paintComponent(Graphics g) {
        // Calling a super class (JPanel) paintComponent method
        super.paintComponent(g);

        upadateRectangle();

        g.setColor(color);
        g.fillRect((int) xDelta, (int) yDelta, 200, 50);

    }

    public void upadateRectangle() {
        xDelta += xDir;

        if (xDelta > 400 || xDelta < 0) {
            xDir *= -1;
            color = getRandomColor();
        }

        yDelta += yDir;

        if (yDelta > 400 || yDelta < 0) {
            yDir *= -1;
            color = getRandomColor();
        }
    }

    private Color getRandomColor() {
        int r = random.nextInt(255);
        int b = random.nextInt(255);
        int g = random.nextInt(255);

        return new Color(r, g, b);
    }
}
