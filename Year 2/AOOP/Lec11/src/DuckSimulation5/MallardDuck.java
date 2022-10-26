/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation5;

/**
 *
 * @author HP
 */
public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehavior = new Quack();
        // A MallardDuck uses the Quack class to handle its quack,
        // so when performQuack is called, the responsibility for the quack
        // is delegated to the Quack object and we get a real quack

        flyBehavior = new FlyWithWings();
        // And it uses flyWithWings as its flyBehavior type

    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}