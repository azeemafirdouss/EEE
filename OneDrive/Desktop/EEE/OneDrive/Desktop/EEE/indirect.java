//28 direct and indirect recursion



import java.util.*;
public class indirect 
{
    public static void methodA (int n)
    {
        if (n > 0)
        {
            System.out.println("method a"+n);
            methodB(n - 1 );
        }
    }
public static void methodB(int n)
{
    if ( n > 0)
    {
        System.out.println("method b"+n);
        methodA( n -1);
    }
}
public static void main(String args[ ])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    methodA(n);
  

}
}