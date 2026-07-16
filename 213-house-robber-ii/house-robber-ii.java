class Solution {
    public int circular(int start , int end , int[] nums){
        int[] dp = new int[end-start+1];

        dp[0] = nums[start];
        if(start == end) return dp[0];
        dp[1] = Math.max(nums[start] , nums[start+1]);
        for(int i=start+2 ; i<=end ; i++){
            dp[i-start] = Math.max(dp[i-start - 2] + nums[i] , dp[i-start - 1]);
        }
        return dp[dp.length - 1];
    }
    public int rob(int[] nums) {
        // int[] dp1 = new int[nums.length]; 
        // int[] dp2 = new int[nums.length - 1];
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0] , nums[1]);
        int n = circular(0,nums.length - 2 , nums);
        int m = circular(1,nums.length - 1 , nums);
        return Math.max(n , m);
        // int m 
        // dp2[0] = Math.max(nums[0] , nums[1]);
        // dp2[1] = Math.max(nums[0] , nums[2]);
        // for(int i=2 ; i<nums.length-1 ; i++){
        //     dp1[i] = Math.max(dp1[i-2] + nums[i] , dp1[i-1]);
        // }
        // dp1[nums.length-1] = Math.max(nums[nums.length-1]+dp1[nums.length-3]-dp1[0] , dp1[nums.length-2]+nums[nums.length-1]);
        
        // return Math.max(dp1[nums.length - 2] , dp1[nums.length - 1]);
    }
}