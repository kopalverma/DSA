class Solution {
    public void sink(char[][] grid , boolean[][] visited , int r , int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length) return;
        if(visited[r][c] || grid[r][c] == '0') return;
        visited[r][c] = true;
        sink(grid , visited , r+1 , c);
        sink(grid , visited , r-1 , c);
        sink(grid , visited , r , c+1);
        sink(grid , visited , r , c-1);
    }
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[r][c];
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count++;
                    sink(grid , visited , i , j);
                }
            }
        }
        return count;
    }
}