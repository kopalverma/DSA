class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }
            else{
                return -1;
            }
        }
        ArrayList<Integer> k = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            k.add(nums[i]);
        }
        Arrays.sort(nums);
        int l=0;
        int r = nums.length - 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return k.indexOf(nums[mid]);
            }
            else if(nums[mid] < target){
                
                l = mid+1;
            }
            else if(nums[mid] > target){
                r = mid - 1;
            }
            
        }
        // if(nums[l] == target) return l;
        return -1;
    }
}