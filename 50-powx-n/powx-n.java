class Solution {
    public double myPow(double x, int n) {
        double p = Double.parseDouble(String.format("%.5f" , Math.pow(x,n)));
        return p;
    }
}