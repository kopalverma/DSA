class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        ArrayList<Integer> at = new ArrayList<>();
        // int c=0;
        // HashMap<Integer , at> map = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        for(int key : map.keySet()){
            if(map.get(key).size() > 1){
                int i=0;
                int j= i+1;
                while(j < map.get(key).size()){
                    if((map.get(key).get(j) - map.get(key).get(i))>k){
                        i++;
                        j++;
                    }
                    else return true;
                }
                // c = (map.get(key).get(j) - map.get(key).get(i));
            }
            // if(c <= k) return true;
        }
        return false;
    }
}