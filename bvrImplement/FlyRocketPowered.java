package ducksimulator.behavior.bvrImplement;

import ducksimulator.behavior.FlyBehavior;

/**
 *
 * @author Delwar
 */
public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("fly(): I fly like a rocket!");
    }
    
}
