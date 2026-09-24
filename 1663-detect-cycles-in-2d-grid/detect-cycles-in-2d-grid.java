class Solution {
    public boolean containsCycle(char[][] grid) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int V = m*n;
        for(int i = 0 ; i<V ; i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int r = 0 ; r<m ; r++){
            for(int c = 0 ; c<n ; c++){
                int u = r*n + c;
                if((r-1)>=0 && grid[r][c] == grid[r-1][c]){
                    adj.get(u).add((r-1)*n+c);
                }
                if((r+1)<m && grid[r][c] == grid[r+1][c]){
                    adj.get(u).add((r+1)*n+c);
                }
                if((c-1)>=0 && grid[r][c] == grid[r][c-1]){
                    adj.get(u).add(r*n+(c-1));
                }
                if((c+1)<n && grid[r][c] == grid[r][c+1]){
                    adj.get(u).add(r*n+(c+1));
                }
            }
        }
        boolean[] visited = new boolean[V];
        for(int i =0 ; i<V ; i++){
            if(!visited[i] && bfsTrick(adj , visited , i)) return true;
        }
        return false;
    }
    public boolean bfsTrick(ArrayList<ArrayList<Integer>> adj , boolean[] visited , int src){
        Queue<int[]> q = new LinkedList<>();
        visited[src] = true;
        q.add(new int[]{src , -1});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int node = curr[0];
            int p = curr[1];
            for(int n : adj.get(node)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(new int[]{n,node});
                }
                else if(n!=p) return true;
            }
        }
        return false;
    }
}