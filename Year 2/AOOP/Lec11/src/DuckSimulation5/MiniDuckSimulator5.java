/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation5;

/**
 *
 * @author HP
 */
public class MiniDuckSimulator5 {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        // This calls the MallardDuck's inherited performQuack() method,
        // which then delegates to the object's QuackBehavior 
        // (i.e. calls quack() on the duck's inherited quackBehavior
        //  reference) 
        mallard.performFly();
        // Then we do the same thing with MallardDuck's inherited
        // performFly() method.
        
        Duck model = new ModelDuck();
        model.performFly();
        // call to performFly() delegates to the flyBehavior
        // object set in ModelDuck's constructor
        model.setFlyBehavior(new FlyRocketPowered());
        // change the duck's behavior at runtime by
        // invoking the model's inherited behavior setter
        // method
        model.performFly();
    }
}
