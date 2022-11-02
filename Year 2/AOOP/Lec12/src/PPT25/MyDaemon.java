/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPT25;

/**
 *
 * @author HP
 */
class MyDaemon implements Runnable {

    public void run() {
        for (int i = 0; true; i++) {
            System.out.println("run():  " + i);
        }
    }
}
