class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int[] a = new int[arr.length];
        for(int i=arr.length-1 ; i>=1 ; i--){
            max = Math.max(max , arr[i]);
            a[i-1] = max;
        }
        a[arr.length - 1] = -1;
        return a;
    }
    
}