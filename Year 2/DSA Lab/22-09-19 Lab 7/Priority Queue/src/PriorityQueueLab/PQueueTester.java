/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PriorityQueueLab;

/**
 *
 * @author HP
 */
public class PQueueTester {
    public static void main(String[] args) {
        MyPQueue queue = new MyPQueue();
        
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(2);
        
        
        queue.toString();
    }
}
