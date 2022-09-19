/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PriorityQueueLab;

//package com.company;
import java.util.Iterator;

public class MyPQueueF {

    FibonacciMinPQ<Integer> heap = new FibonacciMinPQ<Integer>();

    public void enqueue(int d) {
        heap.insert(d);
    }

    public int dequeue() {
        return heap.delMin();
    }

    public int front() {
        return heap.minKey();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        Iterator<Integer> it = heap.iterator();
        ;
        sb.append("[ ");
        while (it.hasNext()) {
            sb.append(it.next()).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
