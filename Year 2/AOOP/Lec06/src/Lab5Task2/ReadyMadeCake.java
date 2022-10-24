/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5Task2;

/**
 *
 * @author HP
 */
public class ReadyMadeCake extends Cake {
    
    protected int quantity;
    
    public ReadyMadeCake(int quantity, String name, double rate) {
        super(name, rate);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + this.quantity + " pieces";
    }
    
    @Override
    public double calPrice() {
        return this.rate * this.quantity;
    }
    
}
