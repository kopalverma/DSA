class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        int k = 0;
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (q.contains(c)) {
                q.remove();
            }

            q.add(c);
            int size = q.size();
            k = Math.max(k, size);
        }

        return k;
    }
}