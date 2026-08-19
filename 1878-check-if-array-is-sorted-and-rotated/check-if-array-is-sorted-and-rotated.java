class Solution {
    public boolean check(int[] nums) {
        int k = 0;
        for(int j = 1 ; j<nums.length ; j++){
            if(nums[j] < nums[j-1]){
                k = j;
                break;
            }
        }
        if(k == 0) return true;
        int[] b = new int[nums.length];
        int[] c = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            c[i] = nums[i];
        }
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length ; i++){
            b[i] = c[(i+k) % c.length];
        }
        for(int i =0 ; i<nums.length ; i++){
            if(b[i] != nums[i]) return false;
        }
        return true;
    }
}