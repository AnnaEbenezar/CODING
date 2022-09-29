/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8Task1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Exception1 {

    public static void main(String[] args) {

        int total = 0;
        int num = 0;

        File myFile = null;
        Scanner inputFile = null;

        myFile = new File("C:\\Users\\HP\\OneDrive\\Desktop\\CODING\\Year 2\\AOOP\\Lec08\\inFile.txt");
        try {
            inputFile = new Scanner(myFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            //Logger.getLogger(Exception1.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (inputFile.hasNext()) {
            try {
                num = inputFile.nextInt();
                total += num;
            } catch (InputMismatchException ex) {
                System.out.println("Illegal Value Found");
                inputFile.next();
            }
        }

        System.out.println("The total value is " + total);
    }
}
