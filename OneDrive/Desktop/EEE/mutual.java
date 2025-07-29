//indirect is also called mutal
import java.util.*;

public class mutual {
    public static boolean isEven(int n)
    {
    if ( n == 0)
        return true;
    return  isOdd(n - 1);
    }
     public static boolean isOdd(int n)
     {
        if( n == 0)
            return false;
        return  isEven(n - 1);
     }
     public static void main(String args[])
     {
        int number = 6;
        if(isEven(number))
        {
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is Odd");
        }

     }
    
}
