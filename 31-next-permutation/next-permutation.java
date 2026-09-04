class Solution {
    
    public void swap(int[] nums, int k, int m){
        int temp = nums[k];
        nums[k] = nums[m];
        nums[m] = temp;
    }
    public int[] sort(int[] nums, int idx){
        int[] b = new int[nums.length - idx - 1];

        for(int i = idx + 1; i < nums.length; i++){
            b[i - idx - 1] = nums[i];
        }

        Arrays.sort(b);

        for(int i = idx + 1; i < nums.length; i++){
            nums[i] = b[i - idx - 1];
        }

        return nums;
    }
    public void nextPermutation(int[] nums) {
        int idx = -1;

        for(int i = nums.length - 2 ; i>=0 ; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums);
            return;
        }
        nums = sort(nums , idx);
        for(int j = idx+1 ; j<nums.length ; j++){
            if(nums[idx]<nums[j]){
                swap(nums , idx , j);
                break;
            }
        }
        return;

    }
    public void reverse(int[] nums){
        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}