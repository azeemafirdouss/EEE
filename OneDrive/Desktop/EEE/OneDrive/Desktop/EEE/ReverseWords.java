import java.util.*;

class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = reverseWords(input);
        System.out.println(result);
    }
}















/*Your brother is solving a puzzle, which is on strings. The puzzle is that we need to read the given sentence in reverse order.

As you are preparing for a programming contest, you want to develop a java program for solving this puzzle. While giving output should not include any extra spaces.
Input Format : string 
output fromat : string 

Example 1:
Input=the sky is blue
Output=blue is sky the

Example 2:
Input="  hello world  " 
Output=world hello
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input=a good   example
Output=example good a
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

Constraints:
1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.

Java Concepts:
String.trim()
String.split()
StringBuilder
*/
// import java.util.*;
// class ReverseWords 
// {
//     public static String reverseWords(String s) 
// 	{
//         //WRITE YOUR CODE HERE USING STRING BUILDER AND toString()
//     }
//     public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//         System.out.println(reverseWords(input));
//     }
// }