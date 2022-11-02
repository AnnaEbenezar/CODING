/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Decorator;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Room room = new SimpleRoom();
//        room = new ColorDecorator(room);
//        room = new CurtainDecorator(room);
//        room = new ColorDecorator(room);
        Room room = new ColorDecorator(new CurtainDecorator(new ColorDecorator(new SimpleRoom())));
        System.out.println(room.showRoom());
    }
    
}
