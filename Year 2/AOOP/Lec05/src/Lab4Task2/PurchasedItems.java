/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4Task2;

/**
 *
 * @author HP
 */
public class PurchasedItems {
    
    private String name;
    private double unitPrice;

    public PurchasedItems() {
        this.name = "no item";
        this.unitPrice = 0;
    }

    public PurchasedItems(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return name + "@" + unitPrice ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
}
