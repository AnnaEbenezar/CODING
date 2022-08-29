/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1Task1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CalculationApp {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int num3;
        
        int largest;
        int smallest;
        int sum;
        int product;
        int average;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the First Integer: ");
        num1 = scan.nextInt();
        
        System.out.print("Enter the Second Integer: ");
        num2 = scan.nextInt();
        
        System.out.print("Enter the Third Integer: ");
        num3 = scan.nextInt();
        
        largest = Math.max(num1, Math.max(num2, num3));
        smallest = Math.min(num1, Math.min(num2, num3));
        
        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;
        average = sum / 3;
                
        System.out.println("For the numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Largest int is: " + largest);
        System.out.println("Smallest int is: " + smallest);
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + product);
        System.out.println("Average is: " + average);
    }
    
}
