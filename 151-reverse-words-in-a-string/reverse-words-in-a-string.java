class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String st="";
        String rev = "";
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                st = st + ch;
            }
            else{
                if(st!=""){
                    rev = " "+st + rev;
                }
                
                st = "";
            }
        }
        return st+rev;
    }
}