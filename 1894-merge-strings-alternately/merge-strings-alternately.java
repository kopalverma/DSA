class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int min = Math.min(word1.length() , word2.length());
        for(int i=0 ; i<min ; i++){
            s =s+word1.charAt(i)+word2.charAt(i);
        }
        if(word1.length() < word2.length()){
            s = s + word2.substring(min);
        }
        else{
            s = s + word1.substring(min);
        }
        return s;
    }
}