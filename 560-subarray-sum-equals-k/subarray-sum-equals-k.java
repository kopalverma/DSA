class Solution {
    public int subarraySum(int[] nums, int k) {
    //    int n=nums.length;
    //    int sum;
    int c=0;
    //    HashMap<Integer , Integer> map = new HashMap<>();
       for(int i=0 ; i<nums.length ; i++){
        int sum=0;
        for(int j=i ; j<nums.length ; j++){
            sum += nums[j];
            if(sum==k){
                // map.put(sum , 1);
                c++;
            }
            
            
        }
        
       }
       
       return c; 
    }
}