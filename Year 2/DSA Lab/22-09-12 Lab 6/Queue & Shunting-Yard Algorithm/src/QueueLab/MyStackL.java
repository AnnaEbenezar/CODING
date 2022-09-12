/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueLab;

/**
 *
 * @author HP
 */
public class MyStackL {
    private class Node {

        double data;
        Node next;

        Node(double data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;

    void push(double x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
    }

    double pop() {
        double temp = top.data;
        top = top.next;
        return temp;
    }

    double top() {
        return top.data;
    }

    boolean isFull() { //never full
        return false;
    }

    boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        String s = "";
        Node temp = top;
        while (temp != null) {
            s += temp.data + " ";
            temp = temp.next;
        }
        return s;
    }
}
