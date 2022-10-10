/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RecursionLab;

/**
 *
 * @author HP
 */
public class Lab8Task1 {
    
    static void printArray(int a[], int i) {
        if (i == a.length) return;        
        System.out.print(a[i] + " ");
        printArray(a, i + 1);
    }
    
    static void printReverse(int a[], int i) {
        if (i == a.length) return;
        printReverse(a, i + 1);
        System.out.print(a[i] + " ");
    }
    
    static void printArrayandReverse(int a[], int i){
        if (i == a.length) return;
        System.out.print(a[i] + " ");
        printArrayandReverse(a, i + 1);
        System.out.print(a[i] + " ");
    }
    
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        printArray(array, 0);
        System.out.println();
        printReverse(array, 0);
        System.out.println();
        printArrayandReverse(array, 0);

    }
    
}
