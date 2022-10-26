/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation1;

/**
 *
 * @author HP
 */
public class RubberDuck extends Duck {

    @Override
    public void performQuack() {
        System.out.println("Squeak");
    }
    
    @Override
    public void performFly() {
        System.out.println("I cannot fly");
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
