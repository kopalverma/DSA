class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1) return Math.round(nums[0] * 100000.0) / 100000.0 ;
        double a =0.0;
        // int i=0;
        // sum = 0;
        // int j= i+1;
        int sum=0;
        for(int m = 0 ; m<k ; m++){
            sum= sum+nums[m];
        }
        int max = sum;
        for(int v = k ; v<nums.length ; v++){
            sum = sum - nums[v-k] + nums[v];
            max = Math.max(sum , max);
        }
        double n = (double) max/k;
        // n = 
        return Math.round(n * 100000.0) / 100000.0;
    }
}