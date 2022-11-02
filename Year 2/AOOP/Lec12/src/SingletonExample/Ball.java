/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingletonExample;

/**
 *
 * @author HP
 */
public class Ball {

    private static Ball ball;
    private String color;

    private Ball(String color) {
        this.color = color;
    }

    public void bounce() {
        System.out.println("boing!");
    }

    public static Ball getInstance(String color) {
        if (ball == null) {
            ball = new Ball(color);
        }
        return ball;
    }
}
