/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation5;

/**
 *
 * @author HP
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        // Model duck has no way to fly
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
