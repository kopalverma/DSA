class Solution {
    public void rotate(int[] nums, int k) {
        int d [] = new int[nums.length];
        int l=nums.length;
        for(int i=0 ; i<l ; i++){
            while(l<k){
                k=k-l;
            }
            if(i<k){
                d[i] = nums[(l-k)+i];
            }
            else{
                d[i] = nums[i-k];
            }
        }
        for(int j = 0 ; j<l ; j++){
            nums[j]=d[j];
            System.out.print(nums[j]+" ");
            // return d[j];
        }
        
    }
}