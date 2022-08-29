/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1Task1;

import java.util.Scanner;

public class Calculate {

    private int num1;
    private int num2;
    private int num3;

    Scanner scan = new Scanner(System.in);

    public void getFirstInt() {
        System.out.print("Enter the First Integer: ");
        num1 = scan.nextInt();
    }

    public void getSecondInt() {
        System.out.print("Enter the Second Integer: ");
        num2 = scan.nextInt();
    }

    public void getThirdInt() {
        System.out.print("Enter the Third Integer: ");
        num3 = scan.nextInt();
    }

    public String getLargest() {
//        largest = Math.max(num1, Math.max(num2, num3));
//        return largest;
        return "Largest is: " + Math.max(num1, Math.max(num2, num3));
    }

    public String getSmallest() {
        return "Smallest is: " + Math.min(num1, Math.min(num2, num3));
    }

    public String getSum() {
        return "Sum is: " + (num1 + num2 + num3);
    }

    public String getProduct() {
        return "Sum is: " + (this.num1 * num2 * num3);
    }

    public String getAvg() {
        return "Smallest is: " + ((num1 + num2 + num3) / 3.0);
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    @Override
    public String toString() {
        return "For the numbers: " + num1 + ", " + num2 + ", " + num3;
    }
    
    
}
