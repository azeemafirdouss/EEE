/*Given a staircase of N steps and you can either climb 1 or 2 steps at a given time. 
The task is to return the count of distinct ways to climb to the top. 

Sample Testcases:
Exaple1
Input: N=3 
Output: 3 
Explanation:
There are three distinct ways of climbing a staircase of 3 steps : [1, 1, 1], [2, 1] and [1, 2].

Example2
Input: N=2 
Output: 2 
Explanation:
There are two distinct ways of climbing a staircase of 3 steps: [1, 1] and [2].

Example3
Input: N=4
Output: 5
(1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)
*/
import java.util.*;
class upstairs
{	
	static int ClimbStairs(int n)
	{
		//Write Your Code here
		if ( n == 0 || n== 1)
		{
		    return 1;
		}
	
		int a = 1;
		int b=1;
		int next = 0;
		for(int i =2 ;i<=n ; i++)
		{
		 next = a+b;
		a = b;
		b = next;
		}
			return next;
	}

	public static void main(String args[])
	{
		//Write Your Code here
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		System.out.print(ClimbStairs(s));
	}
}