package src.inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import src.main.GamePanel;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                gamePanel.changeYDelta(-5);
                // System.out.println("W is pressed");
                break;
            case KeyEvent.VK_A:
                gamePanel.changeXDelta(-5);
                // System.out.println("A is pressed");
                break;
            case KeyEvent.VK_S:
                gamePanel.changeYDelta(5);
                // System.out.println("S is pressed");
                break;
            case KeyEvent.VK_D:
                gamePanel.changeXDelta(5);
                // System.out.println("D is pressed");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
