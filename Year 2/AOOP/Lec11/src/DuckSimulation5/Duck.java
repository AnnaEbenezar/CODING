/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation5;

/**
 *
 * @author HP
 */
public abstract class Duck {

    // Declare two reference variables for the behavior interface types
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior; // All duck subclasses inherit these
    // etc

    public Duck() {
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();      // Delegate to the behavior class
    }

    public void performQuack() {
        quackBehavior.quack();  // Delegate to the behavior class
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}

    
