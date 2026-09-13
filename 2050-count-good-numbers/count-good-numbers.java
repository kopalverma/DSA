class Solution {
    public int findPower(int a , long b){
        if(b == 0) return 1;
        long half = findPower(a , b/2);
        int r = (int)((half * half) % ((int)(Math.pow(10,9))+7));
        if(b%2 == 1){
            r = (int)(((long)r*a) % ((int)(Math.pow(10,9))+7));
        }
        return r;
    }
    public int countGoodNumbers(long n) {
        return (int)((long)findPower(5, (n+1)/2) * findPower(4, n/2) % ((int)(Math.pow(10,9))+7));
    }
}