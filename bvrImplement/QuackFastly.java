package ducksimulator.behavior.bvrImplement;

import ducksimulator.behavior.QuackBehavior;

/**
 *
 * @author Delwar
 */
public class QuackFastly implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("quack(): I can quack very fast!");
   }
    
}
