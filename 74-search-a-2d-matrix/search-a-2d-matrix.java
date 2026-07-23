class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int[] a = new int[matrix.length * matrix[0].length];
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                a.add(matrix[i][j]);
            }
        }
        if(a.contains(target)){
            return true;
        }
        else{
            return false;
        }
        // int f = 0;
        // int l = a.length - 1;
        // while(f<l){
        //     int m = (f+l)/2;
        //     if(a[m] == target){
        //         return true;
        //     }
        //     else if(a[m]>target){
        //         l = m-1;
        //     }
        //     else{
        //         f=m+1;
        //     }
        // }
        // return false;
    }
}