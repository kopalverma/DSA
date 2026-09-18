class Solution {
    public List<Integer> dfsOfGraph(int src , boolean[] visited , ArrayList<ArrayList<Integer>> adj){
        List<Integer> dfs = new ArrayList<>();
        visited[src] = true;
        dfs.add(src);
        for(int node : adj.get(src)){
            if(!visited[node]){
                dfsOfGraph(node , visited , adj);
            }
        }
        return dfs;
    }
    public int findCircleNum(int[][] isConnected) {
        int c=0;
        boolean[] visited = new boolean[isConnected.length];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i =0 ; i<isConnected.length ; i++){
            adj.add(new ArrayList<Integer>());
        }
        int k = isConnected.length;
        for(int i = 0; i<k ; i++){
            for(int j = 0 ; j<k ; j++){
                if(isConnected[i][j] == 1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);

                }
            }
        }
        for(int i =0 ; i<visited.length ; i++){
            if(!visited[i]){
                c++;
                dfsOfGraph(i , visited , adj);
            }
        }
        return c;
    }
}