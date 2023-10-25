package divisorcalctest;

public class DivisorCalc
{
   /**
    * Computes the greatest common divsor of the parameters. Based on
    * Euclid's algorithm.
    */
    public static int gcd(int num1, int num2)
    {
        if (num2 % num1 == 0) 
           return num1;
        else
           return gcd(num2, num1 % num2);
    }
}

