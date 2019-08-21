package ducksimulator;

import static java.lang.Thread.sleep;

/**
 *
 * @author Delwar
 */
public class GamePlay { 
    public boolean isCompletedLevel(char level) throws InterruptedException{        
        System.out.println("Level "+ level + " is running....");
        sleep(3000);               
        return true;
    }
}
