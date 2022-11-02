/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PPT05;

/**
 *
 * @author HP
 */
public class DoARunnable {

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        
        Thread t = new Thread(mr);
        t.start();
        
        for (int i = 0; i < 2000; i++) {
            System.out.println("main(): " + i);
        }
    }
}
