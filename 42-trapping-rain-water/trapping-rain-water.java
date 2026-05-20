class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lm[] = new int[n];
        int rm[] = new int[n];
        int t =height[0];
        for(int i=0 ; i<n ; i++){
            t = Math.max(height[i] , t);
            lm[i]=t;
        } 
        int l =height[n-1];
        for(int j=n-1 ; j>=0 ; j--){
            l = Math.max(height[j] , l);
            rm[j]=l;
        }
        int s=0; 
        for(int k=0 ; k<n ; k++){
            s=(Math.min(lm[k] , rm[k]) - height[k]) + s;
        } 
        return s;
        
    }
}
