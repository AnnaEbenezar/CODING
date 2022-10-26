/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation4;

/**
 *
 * @author HP
 */
public class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior {

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }

    @Override
    public void fly() {
        System.out.println("Red Headed duck can fly");
    }

    @Override
    public void quack() {
        System.out.println("Red Headed duck can Quack");
    }
}
