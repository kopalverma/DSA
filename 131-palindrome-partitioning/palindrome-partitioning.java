class Solution {
    void func(int idx , String s , List<String> res , List<List<String>> ans){
        if(idx == s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i = idx ; i<s.length() ; ++i){
            if(isPalin(s , idx , i)){
                res.add(s.substring(idx , i+1));
                func(i+1 , s , res , ans);
                res.remove(res.size() - 1);
            }
        }
    }
    public boolean isPalin(String s , int start , int e){
        while(start<=e){
            if(s.charAt(start++) != s.charAt(e--)) return false;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans  = new ArrayList<>();
        List<String> at  = new ArrayList<>();
        func(0 , s, at, ans);
        return ans;
    }
}