class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int c = nums1.length;
        int c = n+m;
        int temp;
        // nums1 = new int[c];
        for (int i=0 ; i<n ; i++){
            nums1[m+i] = nums2[i];
        }
        for (int j=0 ; j<c ; j++){
            for(int k=j+1 ; k<c ; k++){
                if(nums1[j]>nums1[k]){
                    temp = nums1[k];
                    nums1[k]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
        for(int u = 0 ; u<c ; u++){
            System.out.print(nums1[u] + ",");
        }
    }
}