package com.leet_code;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int a=prices[0];
        int max=0;
        for (int i = 0; i < prices.length; i++) {
            if (a>prices[i]){
                a=prices[i];
            }
            max=Math.max(prices[i]-a,max);
        }
        return max;
    }
}
