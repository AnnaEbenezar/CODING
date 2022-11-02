/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPT25;

/**
 *
 * @author HP
 */
public class DoADaemon {

    public static void main(String[] args) {
        MyDaemon md = new MyDaemon();
        Thread t = new Thread(md);
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("main(): " + i);

        }
    }
}
