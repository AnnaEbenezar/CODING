/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InnerExample;

/**
 *
 * @author HP
 */
public class DoOuter {

    public static void main(String[] args) {

        Outer o = new Outer();

        Outer.Inner i = o.new Inner();

        i.meth();

    }
}
