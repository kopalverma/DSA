class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums.length ; j++){
                if((nums[j]==0)&&((j+1)!=(nums.length))){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int k = 0 ; k<nums.length ; k++){
            System.out.print(nums[k] + ",");
        }
    }
}