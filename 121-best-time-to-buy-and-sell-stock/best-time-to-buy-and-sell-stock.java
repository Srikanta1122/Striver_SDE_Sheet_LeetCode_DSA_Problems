class Solution {
    public int maxProfit(int[] prices) {
        /*
        int min=prices[0];
        int maxprofit=0;

        for(int i=0;i<prices.length;i++)
        {
            int getcost=prices[i]-min;
            maxprofit=Math.max(maxprofit,getcost);
            min=Math.max(min,prices[i]);
        }

        return maxprofit;

       */

    int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) 
    {
        minPrice = Math.min(minPrice, prices[i]);
        maxPro = Math.max(maxPro, prices[i] - minPrice);
    }

    return maxPro;
    }
}
