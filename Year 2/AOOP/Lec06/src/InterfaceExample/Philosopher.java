/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceExample;

/**
 *
 * @author HP
 */
public class Philosopher implements Speaker {
    int i = 10;
    int s = 16;

    @Override
    public void speak() {
        System.out.println("Philosopher speaks. ");
    }

    public void pontificate() {
        System.out.println("Philosopher pontificates");
    }
}
