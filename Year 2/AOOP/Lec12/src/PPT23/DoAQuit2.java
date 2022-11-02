/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPT23;

/**
 *
 * @author HP
 */
public class DoAQuit2 {

    public static void main(String[] args) {
        MyQuitable2 mq = new MyQuitable2();
        Thread t = new Thread(mq);
        t.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("main(): " + i);
            if (i == 1000) {
                mq.quit();
            }
        }
    }
}
