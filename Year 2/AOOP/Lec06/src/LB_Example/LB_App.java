/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LB_Example;

/**
 *
 * @author HP
 */
public class LB_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LB_2 lb2 = new LB_2();
        LB_1 lb3 = lb2; // compiles ok
        System.out.println(lb3.retValue("Today"));
    }

}
