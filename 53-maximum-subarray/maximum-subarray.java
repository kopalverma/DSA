class Solution {
    public int maxSubArray(int[] nums) {
        int c = nums[0], max = nums[0];
        for(int i =1 ; i<nums.length ; i++){
            c = Math.max(c+nums[i] , nums[i]);
            max = Math.max(c , max);
        }
        return max;
    }
}