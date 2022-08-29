/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec03;

/**
 *
 * @author HP
 */
public class ArraysExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int integerArray[];
        int[] alias;
        
        integerArray = new int[5];
        for (int index = 0; index<integerArray.length; index++) {
            integerArray[index] = 5;
        }
        alias = integerArray;
        alias[3] = 10;
        System.out.println(integerArray[3]);
        
        integerArray = new int[3];
        System.out.println(integerArray[2]);
    }
    
}
