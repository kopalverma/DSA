class Solution {
    public int singleNumber(int[] nums) {
        // int k =0;
        for(int i = 0 ; i<nums.length-1 ; i++){
            nums[nums.length - 1] ^= nums[i];
        }
        return nums[nums.length - 1];
    }
}