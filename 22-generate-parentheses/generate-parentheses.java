class Solution {
    ArrayList<String> result = new ArrayList<>();
    private void solve(int n, String curr, int open, int close) {
        if (curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        if (open < n) {
            curr += '(';
            solve(n, curr, open + 1, close);
            curr = curr.substring(0, curr.length() - 1);
        }
        if (close < open) {
            curr += ')';
            solve(n, curr, open, close + 1);
            curr = curr.substring(0, curr.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        // ArrayList<String> s = new ArrayList<>();
        // for(int i=1 ; i<=n ; i++){
            solve(n,"" , 0 , 0);
        // }
        
        return result;
    }
}