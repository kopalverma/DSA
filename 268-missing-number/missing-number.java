class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> at = new ArrayList<>();
        for(int j = 0 ; j<nums.length ; j++){
            at.add(nums[j]);
        }
        for(int i = 1 ; i<=nums.length ; i++){
            if(!at.contains(i)) return i;
        }
        return 0;
    }
}