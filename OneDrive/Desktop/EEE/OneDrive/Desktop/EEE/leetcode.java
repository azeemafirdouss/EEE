// import java.util.HashMap;

// public class leetcode {
    
//     HashMap<Character ,Integer> n = new HashMap<>();
//     LinkedList<Interger> queue = new LinkedList<>();
//     for (int i=0;i<s.length() ; i++)
//     {
//         char c=s.charAt(1);
//         freq.put(c,freeq.getOrDefault(c,0)+1);
//         queue.offer(1);
//         while(!queue.isEmpty() && n)
//     }




// }


// //

/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.


Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "aabb"
Output: -1

Example 2:
input=advanced
output=2

Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.
*/

import java.util.*;

public class leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // input string

        HashMap<Character, Integer> freq = new HashMap<>();
        LinkedList<Character> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            queue.offer(c);

            // Remove from queue if character count > 1
            while (!queue.isEmpty() && freq.get(queue.peek()) > 1) {
                queue.poll();
            }
        }

        if (queue.isEmpty()) {
            System.out.println(-1);
        } else {
            char firstUnique = queue.peek();
            System.out.println(s.indexOf(firstUnique));
        }
    }
}
