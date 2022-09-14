/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InnerExample;

/**
 *
 * @author HP
 */
public class Outer {
    private int i = 10;

    class Inner { //could be private

        int k = 5;

        void meth() {

            for (int j = 0; j < 3; j++) {

                System.out.println("k = " + k++);

                System.out.println("i = " + i++);

            }

        }

    }
}
