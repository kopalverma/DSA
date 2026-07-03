class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] a = new int[26];
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;
        for(int i = 0 ; i<n ; i++){
            a[s1.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i<=m-n ;i++){
            int[] b = new int[26];

            for(int j = 0 ; j<n ; j++){
                b[s2.charAt(i+j) - 'a']++;
            }
            if(isMatched(a , b)){
                return true;
            }
        }
        return false;

    }
    boolean isMatched(int[] a , int[] b){
        for(int i =0 ; i<a.length ; i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}