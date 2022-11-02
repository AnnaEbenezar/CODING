/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author HP
 */
abstract class RoomDecorator implements Room {

    protected Room specialRoom;

    public RoomDecorator(Room specialRoom) {
        this.specialRoom = specialRoom;
    }

    @Override
    public String showRoom() {
        return specialRoom.showRoom();
    }
}
