class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*(nums.length)];
        int l=ans.length;
        for(int i=0 ; i<l ; i++){
            if(i<nums.length){
                ans[i]=nums[i];
            }
            else{
                ans[i]=nums[i-nums.length];
            }
        }
        return ans;
    }
}