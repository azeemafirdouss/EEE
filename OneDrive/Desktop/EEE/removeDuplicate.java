import java.util.*;
class removeDuplicate{
    public static String removeDuplicate(String s) {
        HashSet<Character> s1 = new HashSet<>();
        StringBuilder sb= new StringBuilder();
        for (char c: s.toCharArray()){
            if(!s1.contains(c))
            {
                s1.add(c);
                sb.append(c);
            }
            
        }
        return sb.toString();
    }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String ss = removeDuplicate(s);
        System.out.println(ss);




}
}




/*
Your team is working on a lingual project,as part of this you are assigned a task, 
read data from keyboard and remove if any duplicate characeters occurs and 
return the new string without duplicates.

input format = string
output format = string
example 1
input=banana
output=ban
*/
// import java.util.*;
// class RemoveDuplicates 
// {
//     public static String removeDuplicates(String s) 
// 	{
//        //WRITE YOUR CODE HERE USING HASHSET
//     }
//     public static void main(String[] args) 
//     {
// 		Scanner sc = new Scanner(System.in);
// 		String input = sc.nextLine();
//         System.out.println(removeDuplicates(input));  
//     }
// }