/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPT27;

/**
 *
 * @author HP
 */
public class DoMySleep {

    public static void main(String[] args) {
        MySleep ms = new MySleep();
        Thread t = new Thread(ms);
        t.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("main(): " + i);
        }
    }
}
