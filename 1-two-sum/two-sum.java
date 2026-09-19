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

}