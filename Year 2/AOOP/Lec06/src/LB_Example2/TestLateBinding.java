/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LB_Example2;

/**
 *
 * @author HP
 */
public class TestLateBinding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LB_1 lb1 = new LB_1();
        LB_2 lb2 = new LB_2();
        LB_1 lb3 = lb2;
        System.out.println("LB_1 called with 10: " + lb1.retValue(10));
        System.out.println("LB_1 called with 'Hello': " + lb1.retValue("Hello"));
        System.out.println("LB_2 called with 20: " + lb2.retValue(20));
        System.out.println("LB_2 called with 'Bye', 30: " + lb2.retValue("Bye", 30));
        System.out.println("LB_3 called with 'Today': " + lb3.retValue("Today"));

    }
}
