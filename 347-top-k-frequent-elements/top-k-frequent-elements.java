class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i , 1);
            }
            else{
                map.put(i , map.get(i)+1);

            }
        }
        List<Integer> sortedKeys = map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).map(Map.Entry::getKey).toList();

        int[] arr = new int[k];
        for(int i =0 ; i<k ; i++){
            arr[i] = sortedKeys.get(i);
        }
        return arr;
    }
}