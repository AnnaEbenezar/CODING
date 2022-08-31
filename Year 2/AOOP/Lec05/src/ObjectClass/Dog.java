/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectClass;

/**
 *
 * @author HP
 */
public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }
    
    public boolean equals(Object o) {
        return this.name.equals(((Dog)o).name);
    }
}
