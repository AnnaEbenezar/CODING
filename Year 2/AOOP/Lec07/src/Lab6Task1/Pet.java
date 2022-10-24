/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6Task1;

/**
 *
 * @author HP
 */
public abstract class Pet extends Animal {
    
    private String name;

    protected Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{"
                + "name='" + name + '\''
                + '}';
    }

    public String getName() {
        return name;
    }
}
