

import java.util.*;

public class tail {
    public static int tail(int n, int result)
    {
        if ( n == 0)
        {
            return result;
        }
        return tail(n-1, n * result);
    }
    public static void main(String args[])
    {
        int n = 5;
        int result = tail(n,1);
        System.out.println("factorial "+result);
    }
}

