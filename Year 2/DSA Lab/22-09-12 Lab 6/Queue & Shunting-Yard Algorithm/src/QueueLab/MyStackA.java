/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueLab;

/**
 *
 * @author HP
 */
public class MyStackA {
    int MAX_SIZE = 1000;
    double stack[] = new double[MAX_SIZE];
    int top = 0;
    
    public void push (double d) {
        stack[top++] = d;
    }
    
    public double pop() {
        return stack[--top];
    }
    
    public double top() {
        return stack[top-1];
    }
    
    public boolean isFull() {
        return top==MAX_SIZE;
    }
    
    public boolean isEmpty() {
        return top==0;
    }
    
    @Override
    public String toString(){
        String s = "";
        for (double i : stack){
            s += i + " ";
        }
        return s;
    }
}
