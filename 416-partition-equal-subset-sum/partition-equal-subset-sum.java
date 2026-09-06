class Solution {
    // int s  = 0;
    public boolean sum(int[] nums , int  i , int target , Boolean[][] dp){
        if(target < 0) return false;
        if(dp[i][target] != null) return dp[i][target];
        if(target == 0) return true;
        if(i == nums.length) return false;
        return dp[i][target] = sum(nums , i+1 , target - nums[i] , dp) || sum(nums , i+1 , target , dp);
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            sum += nums[i];
        }
        if(sum%2 != 0 ) return false;
        Boolean[][] dp = new Boolean[nums.length+1][sum/2 + 1];
        return sum(nums , 0 , sum/2 , dp);
    }
}