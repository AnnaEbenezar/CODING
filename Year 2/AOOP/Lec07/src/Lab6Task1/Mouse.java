/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6Task1;

/**
 *
 * @author HP
 */
public class Mouse extends Animal implements Prey, Talking {
    
    private String name = "The Mouse";
    
    public void move() {
        System.out.println(name + " moves");
    }
    
    public void talk() {
        System.out.println(name + " talks");
    }
    
    public void play() {
        System.out.println(name + " plays");
    }
    
    public void isEaten(Predator p) {
        System.out.println(name + " is eaten by " + p.getName());
    }
    
    public String getName() {
        return name;
    }
}
