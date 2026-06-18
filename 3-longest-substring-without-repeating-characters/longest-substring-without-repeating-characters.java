class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        if(s.equals("")) return 0;
        // map.put(s.charAt(0) , 1);
        // int c=1;
        int m=1;
        int j=0;
        char k;
        for(int i=0 ; i<s.length() ; i++){
            k = s.charAt(i);

            // while(j<i){
                if(map.containsKey(k)){
                    j = Math.max(j , map.get(k)+1);
                    // if(k == s.charAt(i-1)){
                    //     j = map.get(k) - 1;
                    // }
                    // else{
                    //     j = map.get(k)+1;
                    // }

                }
                // else{
                //     map.put(k , i);
                
                // }
                map.put(k , i);
                    
                m = Math.max(m , i - j +1);
                    // map.put(k , 1);
                    // j++;
                    // c++;
                
            // m = Math.max(c ,m);
            // c = 1;
            // if(i!=s.length() && s.charAt(j)!=s.charAt(i+1)) j=0;
        }
        return m;
    }
}