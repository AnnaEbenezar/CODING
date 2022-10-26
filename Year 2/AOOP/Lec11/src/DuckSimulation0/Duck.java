/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DuckSimulation0;

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

    abstract void display();
}
