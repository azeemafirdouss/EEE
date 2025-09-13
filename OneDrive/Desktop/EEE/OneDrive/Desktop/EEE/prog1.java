import java.util.*;

public class prog1 
{
    public static int[] product(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }


    public static void main(String[] args)
     {
        int[] input = {10,2,4,6,3};
        int[] output = product(input);
        System.out.println("Output: " + Arrays.toString(output));
    }
}
// 

// 1 2 3 4 5
// output is like 120,80.....

//28-09-25
// 2nd program

//non tail recursion 
/// using recusion
/// A n left i current
/// 

// import java.util.*;
// public class prog1{

//     public static int {
//             if( i == 0)
//                 return 1;
//             int curr = A[i];
//             int right = findProduct

//     }
// }



