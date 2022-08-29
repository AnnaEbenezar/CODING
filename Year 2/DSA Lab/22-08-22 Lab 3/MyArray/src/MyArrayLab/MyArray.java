//package MyArrayLab;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MyArray {
    int MAX_SIZE = 5;
    int data[] = new int[MAX_SIZE];
    int size = 0;
    
void expands() { //version B
    MAX_SIZE = 2*MAX_SIZE;
    int newData[] = new int[MAX_SIZE];
    System.arraycopy(data, 0, newData, 0, size);
    data = newData;
}

public boolean isFull() {
    return size == MAX_SIZE;
}

public void add(int d) {
    if(isFull()) expands();
    data[size++] = d;
}

}


