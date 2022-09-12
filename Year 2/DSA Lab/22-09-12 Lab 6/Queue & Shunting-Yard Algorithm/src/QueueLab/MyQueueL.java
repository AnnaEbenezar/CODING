/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueLab;

/**
 *
 * @author HP
 */
public class MyQueueL {
    public class Node {
        int data;
        Node next;
        public Node(int d) {
            data = d;
        }
    }
    Node head = null, tail;
    
    public void enqueue(int d) {
        Node p = new Node(d);
        if(head==null)
            head = tail = p;
        else {
            tail.next = p;
            tail = tail.next;
        }
    }
    
    public int dequeue() {
        int d = head.data;
        head = head.next;
        return d;
    }
    
    public int front() {
        return head.data;
    }
    
    public boolean isFull() {
        return false;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyQueueL{");
        sb.append("head=").append(head);
        sb.append(", tail=").append(tail);
        sb.append('}');
        return sb.toString();
    }
}
