class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while(i<=j){
            if(nums[i] == nums[j]){
                if(nums[i] == val){
                    j--;
                }
                else{
                    i++;
                }
            }
            else{
                if(nums[i] == val){
                    int temp;
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
                else if(nums[j] == val){
                    i++;
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return i;
    }
}