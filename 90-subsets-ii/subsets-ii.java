class Solution {
    public void subsets(int idx , int[] nums , List<Integer> at , List<List<Integer>> ans){
        ans.add(new ArrayList<>(at));
        if(idx == nums.length){
            return;
        }
        for(int i = idx ; i<nums.length ; i++){
            if(i!=idx && nums[i] == nums[i-1]) continue;
            at.add(nums[i]);
            subsets(i+1 , nums , at , ans);
            at.remove(at.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> at = new ArrayList<>();
        subsets(0 , nums , at , ans);
        return ans;
    }
}