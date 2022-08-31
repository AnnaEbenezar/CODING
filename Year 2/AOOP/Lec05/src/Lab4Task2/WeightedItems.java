/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4Task2;

/**
 *
 * @author HP
 */
public class WeightedItems extends PurchasedItems {

    private double weight;

    public WeightedItems(double weight, String name, double unitPrice) {
        super(name, unitPrice);
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * this.weight; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.weight+"kg "+this.getPrice()+"$";
    }

}
