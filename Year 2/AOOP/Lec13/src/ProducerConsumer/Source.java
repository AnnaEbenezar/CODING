/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProducerConsumer;

/**
 *
 * @author HP
 */
class Source extends Thread {

    Coordinator c;

    Source(Coordinator coord) {
        c = coord;
    }

    public void run() {
        for (int i = 0; i < 500; i++) {
            c.put(i);
            System.out.println("put; " + i);
            try {
                sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
            }
        }
    }
}
