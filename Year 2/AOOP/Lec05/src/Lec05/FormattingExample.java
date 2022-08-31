/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lec05;

/**
 *
 * @author HP
 */
import java.text.*;

public class FormattingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double fee = 10 / 3;

        // illustrate currency format 
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + currencyFormat.format(fee));

        // illustrate DecimalFormat
        DecimalFormat decimalFormat = new DecimalFormat("##,##0.00");
        System.out.println("Decimal: " + decimalFormat.format(fee));

        // illustrate number format
        NumberFormat noDollarFormat = NumberFormat.getInstance();
        System.out.println("number: " + noDollarFormat.format(fee));

        // illustrate escape sequences
        System.out.println("Before tab \t after tab");
        System.out.println("Before new line \n after new line");
        System.out.println("Display double quote \" ");
    }

}
