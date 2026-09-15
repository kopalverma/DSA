class Solution {
    public void findCombinations(int i , int[] can , int s , List<List<Integer>> ans , List<Integer> at ){
        // if(s>target) return;
        if(s == 0){
            ans.add(new ArrayList<>(at));          
        }
        if(i == can.length) return;

            //   return;

        // }
        for(int j = i ; j<can.length ; j++){
            if(j>i && can[j] == can[j-1]) continue;
            if(can[j] > s) break;
            at.add(can[j]);
            findCombinations(j+1 , can , s - can[j] , ans , at);
            at.remove(at.size() - 1);
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        findCombinations(0 , candidates , target , ans , a);
        return ans;
    }
}