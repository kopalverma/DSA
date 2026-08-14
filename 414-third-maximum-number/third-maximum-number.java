class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int[] a = new int[nums.length];
        for(int i = nums.length - 1 ; i>=0 ; i--){
            a[i] = nums[nums.length - 1 - i];
        }
        ArrayList<Integer> at = new ArrayList<>();
        for(int i = 0 ; i<a.length ; i++){
            if(!at.contains(a[i])){
                at.add(a[i]);
            }
        }
        if(at.size() < 3) return Collections.max(at);
        return at.get(2);
    }
}