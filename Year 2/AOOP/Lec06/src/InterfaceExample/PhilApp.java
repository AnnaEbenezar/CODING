/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InterfaceExample;

/**
 *
 * @author HP
 */
public class PhilApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Speaker guest = new Philosopher();
        Philosopher guest = new Philosopher();
        guest.speak();
        guest.pontificate(); //??
        System.out.println(guest.i);
        System.out.println(guest.j);
        System.out.println(guest.s);

    }
    
}
