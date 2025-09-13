/*A Fibonacci Series is a series of numbers in which the next number is the sum of the previous two numbers.
The first two numbers of the Fibonacci series are 0 and 1. 
The Fibonacci sequence will be like this
0, 1, 1, 2, 3, 5, 8, 13, 21 ...

Sample Test Case:
case=1
input = 6
output=0 1 1 2 3 5

case=2
input= 9
output=0 1 1 2 3 5 8 13 21
*/
import java.util.*;
public class FibonacciCalc
{
	public static int fibonacciRecursion(int n)
	{
	    //WRITE YOUR CODE HERE USING RECURSION
	    int a=0,b=1;
	    int next;
	    for(int i=0 ; i< n ;i++)
	    {
	    System.out.print(a + " ");
	    next =a+b;
	    a = b;
	    b = next;
	    	
	   
	    }
	    return 0 ;
	}
	
    public static void main(String args[]) 
    {
		//WRITE YOUR CODE HERE
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print(fibonacciRecursion(a));
	
	}
	
}