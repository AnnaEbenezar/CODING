package divisorcalctest;

import java.util.Scanner;

public class DivisorCalcTest
{
    /**
     * Computes the GCD of input values.
     */
    public static void main (String args[])
    {
        int num1, num2;
        
        System.out.println("GCD tester");        
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        num2 = scan.nextInt();
            
        System.out.println("GCD of " + num1 + " and " + num2 + " is " +
           DivisorCalc.gcd(num1, num2));
    }
}


