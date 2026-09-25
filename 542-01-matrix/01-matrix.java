class Solution {
    public int[][] updateMatrix(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        int[][] dist = new int[mat.length][mat[0].length];
        Queue<int[]> q = new LinkedList<>();
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                if(mat[i][j] == 0){
                    visited[i][j] = true;
                    q.add(new int[]{i,j,0});
                    // dist[i][j] = 0;
                }
            }
        }
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int k = curr[0];
            int l = curr[1];
            int o = curr[2];
            dist[k][l]=o;
            if((k+1 < n) && !visited[k+1][l]){
                visited[k+1][l] = true;
                q.add(new int[]{k+1 , l , o+1});
            }
            if((k-1>=0) && !visited[k-1][l]){
                visited[k-1][l] = true;
                q.add(new int[]{k-1 , l , o+1});
            }
            if((l+1 < m) && !visited[k][l+1]){
                visited[k][l+1] = true;
                q.add(new int[]{k , l+1 , o+1});
            }
            if((l-1 >=0) && !visited[k][l-1]){
                visited[k][l-1] = true;
                q.add(new int[]{k , l-1 , o+1});
            }
        }
        return dist;
    }
}