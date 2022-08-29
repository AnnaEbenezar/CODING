/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ValidPasswordApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String str = scan.nextLine();

        while (!PasswordVerifier.isValid(str)) {
            System.out.println("Invalid Passwor, Try again");

            System.out.print("Enter a password: ");
            str = scan.nextLine();
        }

        System.out.println("Valid Password");
    }

}
