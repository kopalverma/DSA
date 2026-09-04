class Solution {
    public int solve(String w , String w2 , int i , int j , int[][] dp){
        if(w.length() == i) return w2.length() - j;
        if(w2.length() == j) return w.length() - i;
        if(dp[i][j] != -1) return dp[i][j];
        if(w.charAt(i) == w2.charAt(j)) return dp[i][j] = solve(w,w2,i+1,j+1,dp);
        else return dp[i][j] =  Math.min(1+solve(w,w2,i+1,j+1,dp) , Math.min(1+solve(w,w2,i,j+1,dp) , 1+solve(w,w2,i+1,j,dp)));
        // return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];

        for (int i = 0; i < word1.length(); i++) {
            java.util.Arrays.fill(dp[i], -1);
        }
        return solve(word1 , word2 , 0 , 0 ,dp);
    }
}