class Solution {
    public int maxProduct(int[] nums) {
        // if(nums.length <= 3){
        //     for(int i=0 ; i<nums.length ; i++){
        //         if(nums[i]>0){
        //             break;
        //         }
        //         else if(nums[i] == 0) return 0;
        //         else{

        //         }
        //     }
        // }
        int pre = 1 , suf = 1;
        int m = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length ; i++){
            pre = pre*nums[i];
            
            suf = suf*nums[nums.length - i - 1];
            m = Math.max(Math.max(pre,suf),m);
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;
            
        }
        // for(int i = nums.length - 1 ; i>=0 ; i--){
        //     suf = suf*nums[i];
        //     if(suf == 0) suf = 1;
        //     m = Math.max(suf,m);
        // }
        return m;
    }
}