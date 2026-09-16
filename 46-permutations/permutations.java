class Solution {
    public void permutation(int i , int[] nums , boolean[] flag , List<List<Integer>> ans , List<Integer> at){
        if(at.size() == nums.length){
            ans.add(new ArrayList<>(at));
            return;
        }
        for(int idx=0 ; idx<nums.length ; idx++){
            if(flag[idx] != true){
                flag[idx] = true;
                at.add(nums[idx]);
                permutation(idx+1 , nums , flag , ans , at);
                at.remove(at.size() - 1);
                flag[idx] = false;
                // permutation(idx+1 , nums , flag , ans , at);
            }
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> at = new ArrayList<>();
        permutation(0 , nums , flag , ans , at);
        return ans;
    }
}