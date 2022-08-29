/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PasswordApp {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Enter a password: ");
        String str = scan.nextLine();
        
        System.out.println(PasswordVerifier.isValid(str)? "Valid Password" : "Invalid Password");
    }
}
