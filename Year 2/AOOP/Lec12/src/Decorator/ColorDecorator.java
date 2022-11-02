/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author HP
 */
public class ColorDecorator extends RoomDecorator {

    public ColorDecorator(Room specialRoom) {
        super(specialRoom);
    }

    public String showRoom() {
        return specialRoom.showRoom() + addColors();
    }

    private String addColors() {
        return " + Blue Color";
    }
}
