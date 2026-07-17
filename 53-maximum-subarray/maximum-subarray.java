class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length == 1) return nums[0];
        if(nums.length == 2){
            int c = Math.max(nums[0] , nums[1]);
            int d = Math.max(c , nums[0]+nums[1]);
            return d;
        }
        // int sum = 0;
        dp[0]=nums[0];
        // int sum = nums[0]+nums[1];
        // int e = Math.max(sum , nums[0]);
        // int f = Math.max(e , nums[1]);
        // dp[1] = f;
        // sum=nums[1];
        // if(sum<0) sum=0;

        for(int i=1 ; i<nums.length ; i++){
            // if(sum<0) sum=0;
            // sum = sum+nums[i];
            // if(i==nums.length - 1 && sum<0) return Math.max(dp[i-1] , nums[nums.length - 1]);
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
        }
        int max= Integer.MIN_VALUE;
        for(int i=0 ; i<dp.length ; i++){
            max=Math.max(dp[i] , max);
        }
        return max;
    }
}