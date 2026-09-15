class Solution {
    public void findCombinations(int i , int[] can , int s , List<List<Integer>> ans , List<Integer> at , int target){
        if(s > target) return;
        if(i == can.length){
            if(s == target){
                ans.add(new ArrayList<>(at));
            }
            return;
        }
        at.add(can[i]);
        s += can[i];
        findCombinations(i , can , s , ans , at , target);
        at.remove(at.size() - 1);
        s -= can[i];
        findCombinations(i+1 , can , s , ans , at, target);
    }
    // public void findCombinations(int idx ,int[] candidates, int target , List<List<Integer>> ans , List<Integer> a){
    //     if(idx == candidates.length){
    //         if(target == 0){
    //             ans.add(new ArrayList<>(a));
    //         }
    //         return;
    //     }
    //     if(candidates[idx] <= target){
    //         a.add(candidates[idx]);
    //         findCombinations(idx , candidates , target - candidates[idx] , ans , a);
    //         a.remove(a.size() - 1);
    //     }
    //     findCombinations(idx + 1 , candidates , target , ans , a);
    // }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> at = new ArrayList<>();
        // findCombinations(0 , candidates , target , at , new ArrayList<>());
        findCombinations(0 , candidates , 0 , at , new ArrayList<>() , target);
        return at;
    }
}