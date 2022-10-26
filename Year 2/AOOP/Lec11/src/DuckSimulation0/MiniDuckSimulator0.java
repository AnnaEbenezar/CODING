/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuckSimulation0;

/**
 *
 * @author HP
 */
public class MiniDuckSimulator0 {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.display();

        Duck redhead = new RedHeadDuck();
        redhead.performQuack();
        redhead.display();
    }
}
