class Solution {
    public void findCombinations(int idx ,int[] candidates, int target , List<List<Integer>> ans , List<Integer> a){
        if(idx == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(a));
            }
            return;
        }
        if(candidates[idx] <= target){
            a.add(candidates[idx]);
            findCombinations(idx , candidates , target - candidates[idx] , ans , a);
            a.remove(a.size() - 1);
        }
        findCombinations(idx + 1 , candidates , target , ans , a);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> at = new ArrayList<>();
        findCombinations(0 , candidates , target , at , new ArrayList<>());
        return at;
    }
}