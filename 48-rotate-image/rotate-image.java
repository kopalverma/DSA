class Solution {
    public void rotate(int[][] a) {
        int n = a.length;
        int[][] b = new int[n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                b[i][j] = a[j][i];
            }
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = n-1 ; j>=0 ; j--){
                a[i][n - 1 - j] = b[i][j];
            }
        }
    }
}