class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            dp[i] = 1;
        }
        // dp[0] = 1;
        for(int i = 1 ; i<nums.length ; i++){
            for(int j = 0 ; j<i ; j++){
                if(nums[j] < nums[i]) dp[i] = Math.max(dp[j]+1 , dp[i]);
            }
        }
        int m = 0;
        for(int i = 0 ; i<nums.length ; i++){
            m = Math.max(dp[i] , m);
        }
        return m;
        
    }
}