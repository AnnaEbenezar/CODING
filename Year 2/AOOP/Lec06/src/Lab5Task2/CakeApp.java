/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab5Task2;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CakeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cake[] cakeList;
        cakeList = new Cake[7];
        
        cakeList[0] = new OrderCake(4.5, "Butter", 50);
        cakeList[1] = new ReadyMadeCake(5, "Pound", 25);
        cakeList[2] = new ReadyMadeCake(3, "Sponge", 55);
        cakeList[3] = new OrderCake(14.5, "Genoise", 30);
        cakeList[4] = new OrderCake(11.5, "Biscuit", 38);
        cakeList[5] = new ReadyMadeCake(10, "Angel Food", 49);
        cakeList[6] = new ReadyMadeCake(2, "Chiffon", 15);
        
        double totalPrice = 0;
        double totalPriceReadyMadeCake = 0;
        double highestPrice = 0;
        int totalQuantity = 0;
        int index = 0;
        
        for (int i = 0; i < cakeList.length; i++)   {
            totalPrice += cakeList[i].calPrice();
            if (cakeList[i] instanceof ReadyMadeCake)   {
                totalQuantity += ((ReadyMadeCake) cakeList[i]).quantity;
                totalPriceReadyMadeCake += cakeList[i].calPrice();
            }
            
            if (cakeList[i].calPrice() > highestPrice)  {
                highestPrice = cakeList[i].calPrice();
                index = i;
            }
        }
        
        System.out.println("Total price of all cakes sold " + totalPrice);
        System.out.println("ReadyMadeCake: ");
        System.out.println("\t Total quantity sold " + totalQuantity);
        System.out.println("\t Total price sold " + totalPriceReadyMadeCake);
        System.out.println("Highest Price Cake: " + cakeList[index].toString() 
                + " " + cakeList[index].calPrice());
        
        JOptionPane.showInternalMessageDialog(null, "Total price of all cakes sold " 
                + totalPrice + "\nReadyMadeCake: \n" + "\t Total quantity sold " 
                + totalQuantity + "\n" + "\t Total price sold " + totalPriceReadyMadeCake 
                + "\n" + "Highest Price Cake: " + cakeList[index].toString() + " " 
                + cakeList[index].calPrice());

    }
    
}
