/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

/**
 *
 * @author HP
 */
public class A {
    private A next;
    private int v;
    
    public A(A n, int i) {
        v = i;
        next = n;
    }
    
    public int getT() {
        int t = v;
        if (next != null) {
            t += next.getT();
        }
        return t;
    }
}
