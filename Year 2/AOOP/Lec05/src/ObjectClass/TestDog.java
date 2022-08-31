/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjectClass;

/**
 *
 * @author HP
 */
public class TestDog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog d1, d2;
        d1 = new Dog("a");
        d2 = new Dog("a");
        
        System.out.println(d1.equals(d2));
    }
    
}
