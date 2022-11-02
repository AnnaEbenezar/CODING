/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPT05;

/**
 *
 * @author HP
 */
class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println("run():  " + i);
        }
    }
}
