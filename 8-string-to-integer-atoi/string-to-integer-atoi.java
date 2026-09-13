class Solution {
    public int myAtoi(String s) {
        s = s.stripLeading();
        if(s.length() == 0) return 0;
        String t = "";
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            t += s.charAt(0);
        }
        int i=0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            i = 1;
        }
        
        while(i<s.length()){
            // if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            //     i++;
            // }
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                t += s.charAt(i);
                i++;
            }
            else break;
        }
        if(t.equals("") || t.equals("-") || t.equals("+")) return 0;
        long num = 0;
        for(int j = 0; j < t.length(); j++){
            if(t.charAt(j) == '-' || t.charAt(j) == '+'){
                continue;
            }

            int digit = t.charAt(j) - '0';

            if(num > (Long.MAX_VALUE - digit) / 10){
                if(t.charAt(0) == '-') return Integer.MIN_VALUE;
                else return Integer.MAX_VALUE;
            }

            num = num * 10 + digit;
        }
        if(t.charAt(0) == '-') num = -num;
        if(num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)num;
    }
}