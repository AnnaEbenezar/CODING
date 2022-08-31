/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4Task2;

/**
 *
 * @author HP
 */
public class CountedItems extends PurchasedItems {
    
    private double quantity;

    public CountedItems(double quantity, String name, double unitPrice) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * this.quantity; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.quantity+"units "+this.getPrice()+"$";
    }
    
}
