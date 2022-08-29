/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

/**
 *
 * @author HP
 */
public class AApp {
    
    public static void main(String[] args) {
        A a = new A(null, 3);
        A b = new A(a, 1);
        A c = new A(b, 2);
        
        System.out.println(a.getT());
        System.out.println(c.getT());
    }
}
