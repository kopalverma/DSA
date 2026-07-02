class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0 ; 
        int r = 0;
        int max = 0;
        for(r = 0 ; r<s.length() ; r++){
            freq[s.charAt(r) - 'A']++;
            max = Math.max(max , freq[s.charAt(r) - 'A']);
            if((r-l+1)-max >k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
        }
        return (s.length()-l);
    }
}