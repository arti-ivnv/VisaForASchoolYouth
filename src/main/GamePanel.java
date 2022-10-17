package src.main;

import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import src.inputs.KeyboardInputs;
import src.inputs.MouseInputs;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;

    // Holds our curr mouse cordinates
    // private float xDelta = 100, yDelta = 100;
    // private float xDir = 0.9f, yDir = 0.9f;
    private BufferedImage img;
    private BufferedImage background;

    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        importImage();
        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    private void importImage() {
        // Always needed to be closed after the usage
        InputStream is = getClass().getResourceAsStream("/res/Aiko_WinterUni_Frown.png");
        InputStream is2 = getClass().getResourceAsStream("/res/backgrounds/Classroom_Day.png");

        try {
            img = ImageIO.read(is);
            background = ImageIO.read(is2);
        } catch (IOException e) {
            System.out.println("Image not found");
            e.printStackTrace();
        } finally {
            try {
                is.close();
                is2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280, 820);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    // public void changeXDelta(int value) {
    // this.xDelta += value;
    // }

    // public void changeYDelta(int value) {
    // this.yDelta += value;
    // }

    // public void setRectPosition(int x, int y) {
    // this.xDelta = x;
    // this.yDelta = y;
    // }

    // All the updates comes here:
    // updateAnimationTick()
    // setAnimation()
    // updatePosition();
    public void updateGame() {

    }

    public void paintComponent(Graphics g) {
        // Calling a super class (JPanel) paintComponent method
        super.paintComponent(g);

        g.drawImage(background, 0, 0, null);
        g.drawImage(img, 929, 70, 351, 750, null);
    }

}
