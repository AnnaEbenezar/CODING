/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueLab;

/**
 *
 * @author HP
 */
public class MyQueueA {
    int MAX_SIZE = 100;
    int queue[] = new int[MAX_SIZE];
    int head = 0, tail = 0;
    
    public void enqueue(int d) {
        queue[tail] = d;
        tail = (tail + 1) % MAX_SIZE;
    }
    
    public int dequeue() {
        int d = queue[head];
        head = (head + 1) % MAX_SIZE;
        return d;
    }
    
    public int front() {
        return queue[head];
    }
    
    public boolean isFull() {
        return ((tail + 1) % MAX_SIZE) == head;
    }
    
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyQueueA{");
        sb.append("MAX_SIZE=").append(MAX_SIZE);
        sb.append(", queue=").append(queue);
        sb.append(", head=").append(head);
        sb.append(", tail=").append(tail);
        sb.append('}');
        return sb.toString();
    }       

    void enqueue(String token) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
