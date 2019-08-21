package ducksimulator.ducks;

import ducksimulator.behavior.FlyBehavior;
import ducksimulator.behavior.QuackBehavior;

/**
 *
 * @author Delwar
 */
public class RubberDuck extends Duck{

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        super.flyBehavior = flyBehavior;
        super.quackBehavior = quackBehavior;
        
    }
    
    @Override
    public void displpay() {
        System.out.println("display(): I am a rubber duck");
    }
    
}
