/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PPT12;

/**
 *
 * @author HP
 */
public class DoAThread2 {

    public static void main(String[] args) {
        new MyThread2();

        for (int i = 0; i < 2000; i++) {
            System.out.println("main(): " + i);
        }
    }
}
