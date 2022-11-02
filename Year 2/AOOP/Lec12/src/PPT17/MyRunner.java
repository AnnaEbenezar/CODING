/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPT17;

/**
 *
 * @author HP
 */
class MyRunner implements Runnable {

    String text;

    MyRunner(String s) {
        text = s;
    }

    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(text + i);
        }
    }
}
