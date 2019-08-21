package ducksimulator.behavior.bvrImplement;

import ducksimulator.behavior.FlyBehavior;

/**
 *
 * @author Delwar
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("fly(): I can't fly!");
    }
    
}
