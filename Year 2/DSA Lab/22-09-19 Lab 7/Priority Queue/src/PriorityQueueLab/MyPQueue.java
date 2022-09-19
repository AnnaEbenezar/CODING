/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PriorityQueueLab;

/**
 *
 * @author HP
 */
public class MyPQueue {
    MyMinHeap heap = new MyMinHeap();
    
    public void enqueue(int d) {
        heap.insert(d);
    }
    
    public int dequeue() {
        return heap.remove();
    }
    
    public int front() {
        return heap.peek();
    }
    
    public boolean isFull() {
        return heap.isFull();
    }
    
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        int temp;
        for (temp = 0; temp < heap.size; temp++) {
            sb.append(heap.heap[temp]);
            sb.append("/n");
        }
        return sb.toString();
    }
}
