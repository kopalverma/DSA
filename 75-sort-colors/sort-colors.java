class Solution {
    public void sortColors(int[] nums) {
        int z = 0 , c = 0  , t = nums.length - 1;
        while(c <= t){
            if(nums[c] == 0) swap(nums , z++ , c++);
            else if(nums[c] == 2) swap(nums , c , t--);
            else c++;
        }
    }
    public void swap(int[] nums , int i , int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}