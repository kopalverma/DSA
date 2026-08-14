import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        long sum= 0;
        BigInteger num = BigInteger.valueOf(sum);
        ArrayList<Integer> a = new ArrayList<>();
        int k = digits.length -1;
        for(int i = 0 ; i<digits.length ; i++){
            num = num.multiply(BigInteger.TEN);
            num = num.add(BigInteger.valueOf(digits[i]));
        }
        // sum = sum + 1;
        // BigInteger num = BigInteger.valueOf(sum);
        // int r = -1;
        num = num.add(BigInteger.ONE);
        while(!num.equals(BigInteger.ZERO)){
            int m = num.remainder(BigInteger.TEN).intValue();
            a.add(m);
            num = num.divide(BigInteger.TEN);
        }
        int[] at = new int[a.size()];
        for(int j = a.size() - 1 ; j>=0 ; j--){
            at[j] = a.get(a.size() - 1 - j);
        }
        return at;
    }
}