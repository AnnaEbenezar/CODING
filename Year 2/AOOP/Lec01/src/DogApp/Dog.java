/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DogApp;

/**
 *
 * @author ICKMITL-Student
 */
public class Dog {

    private int size;
    private String breed;
    private String name;
    static String type = new String("Mammal");
    
    static String bark() {
        //System.out.println(“Ruff! Ruff”);
        return new String("Ruff! Ruff!");
    }

    public Dog(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }
    
    

    @Override
    public String toString() {
        return "Dog{" + "size=" + size + ", breed=" + breed + ", name=" + name + '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    

}
