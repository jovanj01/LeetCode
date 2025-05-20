class Solution {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};

        int output = maxProfit(prices);

        System.out.println("rezz: " + output);
    }

    public static int maxProfit(int[] prices){
        int profit = 0;
        int candidate = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > candidate){
                profit += prices[i] - candidate;
            } 
            candidate = prices[i];  
        }

        return profit;
    }
}