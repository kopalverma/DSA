class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int m=0;
        while(i<j){
            // while(j>i){
                if(height[i] <= height[j]){
                    int d=height[i];
                    int e = j-i;
                    int f = d*e;
                    if(f >= m){
                        m=f;
                    }
                    i++;
                }
                else{
                    int d=height[j];
                    int e = j-i;
                    int f = d*e;
                    if(f >= m){
                        m=f;
                    }
                    j--;
                }
                
            // }
            // j--;
            // i=0;
        }
        return m;
        
    }
}