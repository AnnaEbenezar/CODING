/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProducerConsumer;

/**
 *
 * @author HP
 */
class Coordinator {

    int data;
    boolean ready = false;

    public synchronized void put(int in) {
        while (ready) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        data = in;
        ready = true;
        notifyAll();
    }

    public synchronized int get() {
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        ready = false;
        notifyAll();
        return data;
    }

}
