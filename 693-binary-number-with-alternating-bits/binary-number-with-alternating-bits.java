class Solution {
    public boolean hasAlternatingBits(int n) {
        String k = Integer.toBinaryString(n);
        for(int i =1 ; i<k.length() ; i++){
            if(k.charAt(i-1) == k.charAt(i)) return false;
        }
        return true;
    }
}