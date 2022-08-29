/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec2;

/**
 *
 * @author HP
 */
import java.util.Scanner; 

public class GasMileage {

    public static void main(String[] args) {
        int miles;
        double gallons, mpg;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of miles: ");
        miles = scan.nextInt();
        
        System.out.print("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();
        
        mpg = miles / gallons;
        System.out.println("Miles Per Gallon: " + mpg);
    }
}


