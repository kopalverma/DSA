class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if((nums.length == 1)||(nums.length==2)) return nums[0];
        int l = (nums.length/2)+1;
        int l1 = (nums.length/2);
        if(nums[l]==nums[l1]){
            return nums[l];
        }
        return nums[l1];
    }
}