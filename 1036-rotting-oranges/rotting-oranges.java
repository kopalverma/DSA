class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length ; 
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                if(grid[i][j] == 2) q.add(new int[]{i,j});
                else if(grid[i][j] == 1) fresh++;
            }
        }
        int min = 0;
        int[][] dirs = {{1,0} , {-1,0} , {0,1} , {0,-1}};
        while(!q.isEmpty() && fresh>0){
            int size = q.size();
            for(int i = 0 ; i<size ; i++){
                int[] curr = q.poll();
                for(int[] dir : dirs){
                    int nr = curr[0]+dir[0];
                    int nc = curr[1]+dir[1];
                    if(nr>=0 && nc>=0 && nr<row && nc<col && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;
                        q.add(new int[]{nr , nc});
                    }
                }
            }
            min++;
        }
        return fresh == 0 ? min : -1;
    }
}