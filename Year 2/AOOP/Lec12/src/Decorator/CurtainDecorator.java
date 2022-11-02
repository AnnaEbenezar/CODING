/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author HP
 */
public class CurtainDecorator extends RoomDecorator {

    public CurtainDecorator(Room specialRoom) {
        super(specialRoom);
    }

    @Override
    public String showRoom() {
        return specialRoom.showRoom() + addCurtains();
    }

    private String addCurtains() {
        return " + Red Curtains";
    }
}
