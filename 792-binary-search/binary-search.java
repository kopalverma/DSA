class Solution {
    public int search(int[] nums, int target) {
        // int m=-1;
        int f=0;
        int l=nums.length-1;
        int ans=-1;
        // int m=(f+l)/2;
        while(f<=l){
            int m=(f+l)/2;
            if(nums[m]==target){
                ans=m;
                break;
            }
            else if(nums[m]<target){
                f=f+1;
                // m=(f+l)/2;
            }
            else if(nums[m]>target){
                l=l-1;
                // m=(f+l)/2;
            }
            else{
                m=-1;
            }

        }
        return ans;
    }
}