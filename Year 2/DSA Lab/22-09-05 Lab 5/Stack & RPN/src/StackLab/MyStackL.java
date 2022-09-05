/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackLab;

/**
 *
 * @author HP
 */
public class MyStackL {
    public class Node {
        double data;
        Node next;
        public Node(double d) {
            data = d;
        }
    }
    Node top = null;
    
    public void push (double d) {
        Node p = new Node(d);
        p.next = top;
        top = p;
    }
    
    public double pop() {
        double d = top.data;
        top = top.next;
        return d;
    }
    
    public double top() {
        return top.data;
    }
    
    public boolean isFull() {
        return false;
    }
    
    public boolean isEmpty() {
        return top==null;
    }
    
    @Override
    public String toString() {
        String s = "";
        Node temp = top;
        while(temp != null){
            s += temp.data + " ";
            temp = temp.next;
        }
        return s;
    }
}
