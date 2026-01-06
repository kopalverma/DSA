class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int sum = 0;
        int i = 0;

        while (i < n - 1) { // need at least two elements to look ahead
            int k = i + 1;

            // first go up while checking bounds first
            while (k < n && prices[k - 1] < prices[k]) {
                k++;
            }

            sum += prices[k - 1] - prices[i];
            i = k; // continue from the end of this increasing segment
        }

        return sum;
    }
}
