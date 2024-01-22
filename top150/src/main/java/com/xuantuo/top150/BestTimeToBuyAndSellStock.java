package com.xuantuo.top150;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int gap = 0;
        int min = prices[0];

        for(int i=1;i<prices.length;i++){
            if(gap < prices[i] - min){
                gap = prices[i] - min;
            }

            if(min > prices[i]){
                min = prices[i];
            }
        }

        return gap;
    }
}
