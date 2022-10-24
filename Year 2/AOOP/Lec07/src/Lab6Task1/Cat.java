/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6Task1;

/**
 *
 * @author HP
 */
public class Cat extends Pet implements Predator, Playful, Talking {
    
    public Cat(String name) {
        super(name);
        if (name.isEmpty()) {
            name = "The Cat";
        }
    }
    
    public void move() {
        System.out.println(this.getName() + " moves");
    }
    
    public void talk() {
        System.out.println(this.getName() + " talks");
    }
    
    public void play() {
        System.out.println(this.getName() + " plays");
    }
    
    public void eat(Prey p) {
        System.out.println(this.getName() + " eats " + p.getName());
    }
}
