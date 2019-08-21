package ducksimulator.ducks;

import ducksimulator.behavior.FlyBehavior;
import ducksimulator.behavior.QuackBehavior;

/**
 *
 * @author Delwar
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public void swim(){
        System.out.println("swim(): I can float!");
    }
    public abstract void displpay();
    
    public void performFly(){
        flyBehavior.fly();       
    }
    
    public void performQuack(){
        quackBehavior.quack();       
    }
    
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;        
    }
    
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;        
    }
    
    
}
