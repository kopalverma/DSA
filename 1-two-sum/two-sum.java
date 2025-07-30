import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] a;
        a = new int[2];
        for(int i = 0; i < len; i++) {
            for(int j = i+1; j < len; j++) {
                if((nums[j] + nums[i]) == target) {
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }
        return a;  // Correct return of array 'a'
    }

    public static void main(String args[]) {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter o of array elements");
        int n = sc.nextInt();

        int[] nums = new int[n];  // Initialize the array 'nums'

        System.out.println("Enter array elements");
        for(int v = 0; v < n; v++) {
            nums[v] = sc.nextInt();
        }

        for(int v = 0; v < n; v++) {
            System.out.println(nums[v]);
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int[] result = obj.twoSum(nums, target);  // Get result from twoSum method

        for(int k = 0; k < 2; k++) {
            System.out.println(result[k]);  // Print result array 'result', not 'a'
        }

        sc.close();  // Close the scanner
    }
}