class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        ArrayList<List<String>> at = new ArrayList<>();
        for(int i = 0 ; i<strs.length ; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            List<String> st = new ArrayList<>();
            st.add(strs[i]);
            // at.add(st);
            if(!map.containsKey(s)){
                map.put(s , st);
            }
            else{
                // st.add(strs[i]);
                map.get(s).add(strs[i]);
            }
        }
        for(String key : map.keySet()){
            at.add(map.get(key));
        }
        return at;
    }
}