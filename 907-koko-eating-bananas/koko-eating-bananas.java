class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Arrays.sort(piles);
        long k=0;
        for(int i=0 ; i<piles.length ; i++){
            k = Math.max(piles[i] , k);
        }
        // int k = piles[piles.length - 1];
        long f= 1;
        long c =0;
        // int d=0;
        long mid=0;
        while(f<=k){
            mid = (f+k)/2;
            // if(mid == 0) break;
            c=0;
            for(int i=0 ; i<piles.length ; i++){
                c += (long)Math.ceil((double)piles[i] / mid);
            }
            // d = Math.min(c , d);
            if(c <= h){
                k = mid - 1;
            }
            else{
                f = mid + 1;
            } 
            // d=mid;
        }
        // if(c > h){
        //     return mid+1;
        // }
        // else{
        //     return mid;
        // }
        // else{
        //     return mid;
        // } 
        return (int)f;
        
    }
}