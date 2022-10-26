/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation1;

/**
 *
 * @author HP
 */
public class MiniDuckSimulator2 {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performSwim();
        mallard.performFly();
        mallard.display();

        Duck redhead = new RedHeadDuck();
        redhead.performQuack();
        redhead.performSwim();
        redhead.performFly();
        redhead.display();

        Duck rubber = new RubberDuck();
        rubber.performQuack();
        rubber.performSwim();
        rubber.performFly();
        rubber.display();
    }
}
