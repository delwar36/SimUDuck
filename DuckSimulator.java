package ducksimulator;

import ducksimulator.behavior.bvrImplement.FlyGorgiously;
import ducksimulator.behavior.bvrImplement.FlyNoWay;
import ducksimulator.behavior.bvrImplement.FlyWithWings;
import ducksimulator.behavior.bvrImplement.MuteQuack;
import ducksimulator.behavior.bvrImplement.QuackSlowly;
import ducksimulator.behavior.bvrImplement.QuackFastly;
import ducksimulator.ducks.Duck;
import ducksimulator.ducks.MallardDuck;
import ducksimulator.ducks.RubberDuck;
import ducksimulator.ducks.SwanDuck;

/**
 *
 * @author Delwar
 */
public class DuckSimulator {

    
    public static void main(String[] args) throws InterruptedException{
        
        GamePlay gamePlay = new GamePlay();
        
        System.out.println("MALLARD DUCK");
        Duck mallard = new MallardDuck(new FlyWithWings(), new QuackSlowly());
        mallard.displpay();
        mallard.swim();        
        
        if(gamePlay.isCompletedLevel('A')){
            System.out.println("WOW!! Level Completed!!");
           mallard.performQuack(); 
        }
        if(gamePlay.isCompletedLevel('B')){
            System.out.println("WOW!! Level Completed!!");
            mallard.performFly();          
        }
        
        
        System.out.println("\nSWAN DUCK");        
        Duck swan = new SwanDuck(new FlyGorgiously(), new QuackFastly());
        swan.displpay();
        swan.swim();       
        
        if(gamePlay.isCompletedLevel('A')){
            System.out.println("WOW!! Level Completed!!");
           swan.performQuack(); 
        }
        if(gamePlay.isCompletedLevel('B')){
            System.out.println("WOW!! Level Completed!!");
            swan.performFly();          
        }
        
        System.out.println("\nRUBBER DUCK");        
        Duck rubber = new RubberDuck(new FlyNoWay(), new MuteQuack());
        rubber.displpay();
        rubber.swim();       
        
        if(gamePlay.isCompletedLevel('A')){
            System.out.println("WOW!! Level Completed!!");
            rubber.performQuack(); 
        }
        if(gamePlay.isCompletedLevel('B')){
            System.out.println("WOW!! Level Completed!!");
            System.out.println("setQuackBehavior(): ");
            rubber.setQuackBehavior(new QuackSlowly());    
            rubber.performQuack();
            rubber.performFly();
        }
        
        
        
    }
    
}
