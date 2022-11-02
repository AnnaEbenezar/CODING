/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPT23;

/**
 *
 * @author HP
 */
class MyQuitable2 implements Runnable {

    boolean go = true;

    public void quit() {
        go = false;
    }

    public void run() {
        for (int i = 0; go; i++) {
            System.out.println("run():  " + i);
        }
    }
}
