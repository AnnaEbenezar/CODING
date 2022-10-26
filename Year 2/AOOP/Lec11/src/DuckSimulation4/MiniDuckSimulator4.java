/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation4;

/**
 *
 * @author HP
 */
public class MiniDuckSimulator4 {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        mallard.quack();
        mallard.performSwim();
        mallard.fly();
        mallard.display();

        RedHeadDuck redhead = new RedHeadDuck();
        redhead.quack();
        redhead.performSwim();
        redhead.fly();
        redhead.display();

        RubberDuck rubber = new RubberDuck();
        rubber.quack();
        rubber.performSwim();
        rubber.display();
    }
}
