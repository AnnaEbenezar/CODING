/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6Task1;

/**
 *
 * @author HP
 */
public class Fish extends Pet implements Prey {
    
    public Fish(String name) {
        super(name);
        if (name.isEmpty()){
            name = "The Fishy";
        }
    }
    
    public void move() {
        System.out.println(this.getName() + " moves");
    }
    
    public void isEaten(Predator p) {
        System.out.println(this.getName() + " is eaten by " + p.getName());
    }
}
