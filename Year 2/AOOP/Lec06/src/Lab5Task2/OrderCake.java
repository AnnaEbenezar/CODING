/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5Task2;

/**
 *
 * @author HP
 */
public class OrderCake extends Cake {
    protected double weight;
    
    public OrderCake(double weight, String name, double rate) {
        super(name, rate);
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + this.weight + " kg";
    }
    
    @Override
    public double calPrice() {
        return this.rate * this.weight;
    }
    
}
