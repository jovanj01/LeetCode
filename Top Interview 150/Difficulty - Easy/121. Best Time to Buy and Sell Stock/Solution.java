class Solution{
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int profit = maxProfit(prices);

        System.out.println("Max profit iznosi: " + profit);
    }

    public static int maxProfit(int[] prices) {
        int pricesLen = prices.length;
        if(pricesLen == 0){
            return 0;
        }

        int currentMaxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < pricesLen; i++) {
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }else{
                currentMaxProfit = Math.max(currentMaxProfit, prices[i] - minPrice);
            }
        }

        return currentMaxProfit;
    }

    //ovo resenje radi ali exceeduje time limit pa prolazi 204/211 testova
    // public static int maxProfit(int[] prices) {
    //     if(prices.length == 0) {
    //         return 0;
    //     }

    //     int currentMaxProfit = 0;

    //     for (int i = 0; i < prices.length; i++) {
    //         for(int j = i; j < prices.length; j++) {
    //             if(prices[j]-prices[i] > currentMaxProfit){
    //                 currentMaxProfit = prices[j]-prices[i];
    //             }
    //         }
    //     }

    //     if (currentMaxProfit <= 0) return 0;

    //     return currentMaxProfit;
    // }
}