class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length(); 
        int i = 0;
        int j=n-1;
        String r="";
        while(i<j && i<n-1 && j>=0){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                r=s.substring(0,j) + s.substring(j+1,n);
                s=s.substring(0,i) + s.substring(i+1,n);
                break;
                
            }
        }
        int k= s.length();
        i=0;
        j=k-1;
        while(i<=j && i<k && j>=0){
            if(s.charAt(i) == s.charAt(j) ){
                i++;
                j--;
            }
            else{
                // return false;
                i=0;
                j=k-1;
                while(i<=j && i<k && j>=0){
                    if(r.charAt(i) == r.charAt(j)){
                        i++;
                        j--;
                    }
                    else return false;
                }
            }

        }
        return true;
        
    }
}