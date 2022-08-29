/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FooApp;

/**
 *
 * @author ICKMITL-Student
 */
public class FooApp {

    public static void main(String[] args) {
        System.out.println("" + Fi.getK());
        Fe f = new Fe();
        System.out.println("" + f.getI());
        System.out.println("" + f.getISquare());
        Fe g = new Fe();
        System.out.println("" + f.getISquare());

    }
}
