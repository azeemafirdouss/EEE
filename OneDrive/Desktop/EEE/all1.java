
//26-7-25 tesselator problems

// /*A Fibonacci Series is a series of numbers in which the next number is the sum of the previous two numbers.
// The first two numbers of the Fibonacci series are 0 and 1. 
// The Fibonacci sequence will be like this
// 0, 1, 1, 2, 3, 5, 8, 13, 21 ...

// Sample Test Case:
// case=1
// input = 6
// output=0 1 1 2 3 5

// case=2
// input= 9
// output=0 1 1 2 3 5 8 13 21
// */
// import java.util.*;
// public class FibonacciCalc
// {
// 	public static int fibonacciRecursion(int n)
// 	{
// 	    //WRITE YOUR CODE HERE USING RECURSION
// 	    int a=0,b=1;
// 	    int next;
// 	    for(int i=0 ; i< n ;i++)
// 	    {
// 	        System.out.print(a + " ");
// 	    next =a+b;
// 	    a = b;
// 	    b = next;
	    	
	   
// 	    }
// 	    return 0 ;
// 	}
	
//     public static void main(String args[]) 
//     {
// 		//WRITE YOUR CODE HERE
// 		Scanner sc= new Scanner(System.in);
// 		int a=sc.nextInt();
// 		System.out.print(fibonacciRecursion(a));
	
// 	}
	
// } 
// /*Given a staircase of N steps and you can either climb 1 or 2 steps at a given time. 
// The task is to return the count of distinct ways to climb to the top. 

// Sample Testcases:
// Exaple1
// Input: N=3 
// Output: 3 
// Explanation:
// There are three distinct ways of climbing a staircase of 3 steps : [1, 1, 1], [2, 1] and [1, 2].

// Example2
// Input: N=2 
// Output: 2 
// Explanation:
// There are two distinct ways of climbing a staircase of 3 steps: [1, 1] and [2].

// Example3
// Input: N=4
// Output: 5
// (1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)
// */
// import java.util.*;
// class Stairs
// {	
// 	static int ClimbStairs(int n)
// 	{
// 		//Write Your Code here
// 		if ( n == 0 || n== 1)
// 		{
// 		    return 1;
// 		}
	
// 		int a = 1;
// 		int b=1;
// 		int next = 0;
// 		for(int i =2 ;i<=n ; i++)
// 		{
// 		 next = a+b;
// 		a = b;
// 		b = next;
// 		}
// 			return next;
// 	}

// 	public static void main(String args[])
// 	{
// 		//Write Your Code here
// 		Scanner sc = new Scanner(System.in);
// 		int s=sc.nextInt();
// 		System.out.print(ClimbStairs(s));
// 	}
// }

// /*
// Your team is working on a lingual project,as part of this you are assigned a task, 
// read data from keyboard and remove if any duplicate characeters occurs and 
// return the new string without duplicates.

// input format = string
// output format = string
// example 1
// input=banana
// output=ban
// */
// import java.util.*;
// class RemoveDuplicates 
// {
//     public static String removeDuplicates(String s) 
// 	{
	    
//        //WRITE YOUR CODE HERE USING HASHSET
//        HashSet<Character> s1 = new HashSet<>();
//         StringBuilder sb= new StringBuilder();
//         for (char c: s.toCharArray()){
//             if(!s1.contains(c))
//             {
//                 s1.add(c);
//                 sb.append(c);
//             }
            
//         }
//         return sb.toString();
//     }
//     public static void main(String[] args) 
//     {
// 		Scanner sc = new Scanner(System.in);
// 		String input = sc.nextLine();
//         System.out.println(removeDuplicates(input));  
//     }
// }


// /*
// Your english teacher has given you a task, which is counting the number of occurances of each word in given paragraph. With your programming skills write a java program to do this task. You need to print the words and it's number of occurances in descending order.

// input format = space seperated string
// output format = String: Intger

// Sample input 1=
// hello how are you hello kmit hello you
// output=hello: 3
// you: 2
// how: 1
// are: 1
// kmit: 1

// Sample input2 =a b c a b c a b c
// output=a: 3
// b: 3
// c: 3
// */
// import java.util.*;
// class WordFrequencyCounter 
// {
//     public static void main(String[] args) 
// 	{
// 		//WRITE YOUR CODE HERE USING HASHMAP
		
// 		Scanner sc = new Scanner(System.in);
//         String[] words = sc.nextLine().split(" ");
        
//         HashMap<String, Integer> freqMap = new HashMap<>();
        
//         for (String word : words)
//         {
//             freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
//         }

//         ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());
//         list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

//         for (Map.Entry<String, Integer> entry : list)
//         {
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }
//     }
// }
// /*Your brother is solving a puzzle, which is on strings. The puzzle is that we need to read the given sentence in reverse order.

// As you are preparing for a programming contest, you want to develop a java program for solving this puzzle. While giving output should not include any extra spaces.
// Input Format : string 
// output fromat : string 

// Example 1:
// Input=the sky is blue
// Output=blue is sky the

// Example 2:
// Input="  hello world  " 
// Output=world hello
// Explanation: Your reversed string should not contain leading or trailing spaces.

// Example 3:
// Input=a good   example
// Output=example good a
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

// Constraints:
// 1 <= s.length <= 104
// s contains English letters (upper-case and lower-case), digits, and spaces ' '.
// There is at least one word in s.

// Java Concepts:
// String.trim()
// String.split()
// StringBuilder
// */
// import java.util.*;
// class ReverseWords 
// {
//     public static String reverseWords(String s) 
// 	{
//         //WRITE YOUR CODE HERE USING STRING BUILDER AND toString()
        
//          String[] words = s.trim().split("\\s+");
//         StringBuilder sb = new StringBuilder();
//         for (int i = words.length - 1; i >= 0; i--) {
//             sb.append(words[i]);
//             if (i != 0) sb.append(" ");
//         }
//         return sb.toString();
//     }
//     public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//         System.out.println(reverseWords(input));
//     }
// }



// /*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.


// Example 1:
// Input: s = "leetcode"
// Output: 0
// Explanation:
// The character 'l' at index 0 is the first character that does not occur at any other index.

// Example 2:
// Input: s = "aabb"
// Output: -1

// Example 2:
// input=advanced
// output=2

// Constraints:
// 1 <= s.length <= 105
// s consists of only lowercase English letters.
// */
// import java.util.*;
// class FirstUniqCharQueue 
// 	{
//     public static int firstUniqChar(String s) 
// 	{

//         //WRITE YOUR CODE HERE USING HASHMAP AND QUEUE/LL
//         HashMap<Character, Integer> freq = new HashMap<>();
//         LinkedList<Character> queue = new LinkedList<>();

//         for (int i = 0; i < s.length(); i++)
//         {
//             char c = s.charAt(i);
//             freq.put(c, freq.getOrDefault(c, 0) + 1);
//             queue.offer(c);

//             // Remove from queue if character count > 1
//             while (!queue.isEmpty() && freq.get(queue.peek()) > 1) 
//             {
//                 queue.poll();
//             }
//         }

//         if (queue.isEmpty())
//         {
//             return -1;
//         } 
//         else
//         {
//             char firstUnique = queue.peek();
//             return s.indexOf(firstUnique);
//         }
// 	}
    
//     public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		String st = sc.nextLine();
//         System.out.println(firstUniqChar(st)); 
//     }
// }



