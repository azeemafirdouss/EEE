import java.util.*;
public class nontailrecursion {
    public static int sumOfDigits(int n)
    {
        if ( n == 0)
        {
            return 0;
        }
        int lastDigit = n % 10;
        int sum = sumOfDigits (n / 10);
        return sum + lastDigit ;

    }
    public static void main(String[] args) {
        int number = 5746;
        System.out.println(" non tail recursin "+ sumOfDigits(number) );

    }
}

