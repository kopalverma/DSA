class Solution {
    public int maxProfit(int[] prices) {
        int c = 0;
        int k = prices[0];
        for (int i = 1 ; i< prices.length ; i++){
            if(prices[i]>k){
                int d = prices[i]-k;
                if(c<d){
                    c=d;
                }
            }
            else{
                k=prices[i];
            }
        }
        return c;
        
    }
}