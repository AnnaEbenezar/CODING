/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author HP
 */
public class DecoratorDesignPatternMain {

    public static void main(String args[]) {
        Room room = new CurtainDecorator(new ColorDecorator(new SimpleRoom()));
        System.out.println(room.showRoom());
    }
}
