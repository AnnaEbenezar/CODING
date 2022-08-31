/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab4Task2;

/**
 *
 * @author HP
 */
public class PurchaseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PurchasedItems item1 = new WeightedItems(1.37, "Banana", 3.00);
        PurchasedItems item2 = new CountedItems(10, "Pen", 4.5);
        System.out.println(item1);
        System.out.println(item2);
    }
    
}
