/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab1Task1;

/**
 *
 * @author HP
 */
public class CalculateAppC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculate c = new Calculate();
        c.getFirstInt();
        c.getSecondInt();
        c.getThirdInt();
        System.out.println(c.toString());
        System.out.println(c.getLargest());
        System.out.println(c.getSum());
        System.out.println(c.getProduct());
        System.out.println(c.getAvg());
        
    }
    
}
