package ducksimulator.behavior.bvrImplement;

import ducksimulator.behavior.FlyBehavior;

/**
 *
 * @author Delwar
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("fly(): I can fly by my wings!");
    }
    
}
