/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestMethod;

/**
 *
 * @author HP
 */
public class PolyMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s = new Circle();
        System.out.println(s.getClass());
        s.draw();
        //s.erase();
        ((Circle)s).erase();
        s.setColor();

    }
    
}
