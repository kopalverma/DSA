class Solution {
    public int countDigits(int num) {
        int t=num;
        int c=0;
        while(num>0){
            int r = num%10;
            if(t%r == 0) c++;
            num = num/10;
        }
        return c;
    }
}