/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PPT17;

/**
 *
 * @author HP
 */
public class DoRunnables {

    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            MyRunner mr = new MyRunner("Runner " + j + ": ");
            Thread t = new Thread(mr);
            t.setPriority(j+1);
            t.start();
        }
        for (int i = 0; i < 500; i++) {
            System.out.println("main(): " + i);
        }
    }
}
