class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length == 1) return nums[0];
        if(nums.length == 2){
            int c = Math.max(nums[0] , nums[1]);
            int d = Math.max(c , nums[0]+nums[1]);
            return d;
        }
        dp[0]=nums[0];
        ;

        for(int i=1 ; i<nums.length ; i++){
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
        }
        int max= Integer.MIN_VALUE;
        for(int i=0 ; i<dp.length ; i++){
            max=Math.max(dp[i] , max);
        }
        return max;
    }
}