/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreatingExceptions;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CreatingException { // This method must declare that it throws a OutOfRangeException .

    public static void main(String[] args) throws OutOfRangeException {
        final int MIN = 25, MAX = 40;
        Scanner scan = new Scanner(System.in);
        OutOfRangeException problem = new OutOfRangeException("Input value is out of range.");
        System.out.print("Enter an integer value between " + MIN + " and " + MAX + ", inclusive: ");
        int value = scan.nextInt();
        //Determine if the exception should be thrown
        if (value < MIN || value > MAX) {
            throw problem;
        }
        System.out.println("End of main method.");
    }
}
