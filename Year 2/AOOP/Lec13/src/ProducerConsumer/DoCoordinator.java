/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProducerConsumer;

/**
 *
 * @author HP
 */
public class DoCoordinator {

    public static void main(String[] args) {
        Coordinator c = new Coordinator();
        Source so = new Source(c);
        Sink si = new Sink(c);
        so.start();
        si.start();
    }
}
