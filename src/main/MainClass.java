package src.main;

/*
 *          *******
 *          *11111*
 *          *11111*
 *          *11111*
 *          *******
 * 
 *  * - JFrame
 *  1 - JPanel
 * ===========================================
 * 
 * UPS (update / tick) vs FPS (render / frame)
 * 
 *  Takes care of logic                  || Draws the game scene
 *      playermove, events               ||      the level, player, enemies, etc
 *  Same on all PCs                      || Can be changed
 *  In case of lagg a way to "catch up"  ||
 *  
 * ===========================================
 * 
 * Reasons to separate the two:
 * 1) Easier to read the code
 * 2) Can sacrifice some frames to save the Updates
 * 3) Can set Different FPS for different systems
 * 
 */

public class MainClass {
    public static void main(String[] args) {
        new Game();
    }
}
