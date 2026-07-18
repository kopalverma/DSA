class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        for(int i = 0; i < strs.length; i++){
            if(strs[i].equals("")) return "";
        }

        int l = 200;
        String b = "";
        for(int i = 0; i < strs.length; i++){
            int k = strs[i].length();
            if(k <= l){
                l = k;
                b = strs[i];
            }
        }

        int q = 0;

        // ✓ Real prefix checking (this replaces your broken loops)
        for(int index = 0; index < l; index++){
            char ch = b.charAt(index);

            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(index) != ch){
                    return b.substring(0, q); // mismatch → done
                }
            }

            q++; // matched for all strings
        }

        return b.substring(0, q);
    }
}
