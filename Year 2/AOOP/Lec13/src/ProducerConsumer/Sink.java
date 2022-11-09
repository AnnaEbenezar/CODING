/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProducerConsumer;

/**
 *
 * @author HP
 */
class Sink extends Thread {

    Coordinator c;

    Sink(Coordinator coord) {
        c = coord;
    }

    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("get:      " + c.get());
        }
    }
}
