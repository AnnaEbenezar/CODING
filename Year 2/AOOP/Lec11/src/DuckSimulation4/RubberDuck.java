/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation4;

/**
 *
 * @author HP
 */
public class RubberDuck extends Duck implements QuackBehavior {

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }

    @Override
    public void quack() {
        System.out.println("A rubber duckie can squeak");
    }
}
