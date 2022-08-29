/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec2;

/**
 *
 * @author HP
 */
import java.util.Scanner; 
public class Echo {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        message = scan.nextLine();
        System.out.println ("You entered:" + message); 
    }
    
}
