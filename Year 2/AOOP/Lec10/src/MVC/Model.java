/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

/**
 *
 * @author HP
 */
public class Model extends java.util.Observable {

    private int counter;

    public void setValue(int value) {
        this.counter = value;
        setChanged();
        notifyObservers(counter);
    } //setValue()

    public void incrementValue() {
        ++counter;
        setChanged();
        notifyObservers(counter);
    } //incrementValue()
} //Model

