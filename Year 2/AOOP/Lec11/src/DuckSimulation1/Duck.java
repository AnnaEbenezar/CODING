/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation1;

/**
 *
 * @author HP
 */
public abstract class Duck {

    public void performQuack() {
        System.out.println("Quack");
    }

    public void performSwim() {
        System.out.println("Swim");
    }

    public void performFly() {
        System.out.println("I can fly");
    }

    abstract void display();
}
