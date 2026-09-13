class Solution {
    long mod = (long)1e9+7;
    public long findPow(long a , long b){
        if(b==0) return 1;
        long half = findPow(a , b/2);
        if(b%2 == 0){
            return (half * half)%mod;
        }
        else return (a * half*half)%mod;
    }
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        long l =0 , r = nums.length - 1;
        long res = 0;
        while(l<=r){
            // if(nums[l]+nums[r] > target) r--;
            // else{
                if(nums[(int)l]+nums[(int)r] <= target){
                    res += findPow(2 , r-l);
                    l++;
                }
                else r--;
            // }
        }
        return (int)(res % ((int)(Math.pow(10 , 9)) + 7));
    }
}