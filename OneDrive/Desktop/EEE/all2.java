public @interface all2 {
    /*
You are part of a computational task engine that processes a chain of nested tasks.
Each task depends on completing all its sub-tasks first, and the total weight 
of a task is calculated by multiplying the weights of all sub-tasks below it, 
down to the simplest task which has a base weight of 1.

Given a non-negative integer n, representing the depth of nested tasks,
write a function to compute the total weight of the task at depth n.
input format : an integer 
output format : an integer 

example 1:
input=5
output=120

example 2:
input=12
output=479001600
*/
// import java.util.*;
// class WeightCalc 
// {
//     // Recursive method to compute the task weight
//     public static int computeTaskWeight(int n) 
//     {
//         //WRITE YOUR CODE HERE USING RECURSION
//         if(n==0)
//         {
//             return 1;
//         }
//         return n * computeTaskWeight(n-1);
//     }

//     public static void main(String[] args) 
//     {
// 		Scanner sc = new Scanner(System.in);
//         int depth = sc.nextInt(); 
//         int result = computeTaskWeight(depth);
//         System.out.println(result);
//     }
// }
// }


/* Given an integer array, replace each element with the product of every other element without using the division operator.

Input format : an integer number n
                n number of integers
output format :List of n integers
For example,

Input: 5  
1 2 3 4 5 
Output:[ 120, 60, 40, 30, 24 ]
 
 
Input:6  
 5 3 4 2 6 8
Output:[ 1152, 1920, 1440, 2880, 960, 720 ]*/
import java.util.Arrays;
import java.util.*;
class ArrayProduct
{
    /* Recursive function to replace each array element with the product of 
    every other element without using the division operator*/
    public static int findProduct(int[] A, int n, int left, int i)
    {
        //WRITE YOUR CODE HERE
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n] ;
        for(int i =0;i<n;i++)
        {
            A[i] = sc.nextInt();
        }
        findProduct(A, A.length, 1, 0);
        System.out.println(Arrays.toString(A));
    }
}
