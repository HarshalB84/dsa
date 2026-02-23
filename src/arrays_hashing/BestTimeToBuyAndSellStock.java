package arrays_hashing;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices){

        // prices = [7,1,5,3,6,4]
        int profit = 0;

        //Naive approach
//        for(int i=0;i< prices.length-1;i++){
//            for(int j=i+1;j< prices.length;j++){
//                profit = Math.max(profit, prices[j] - prices[i]);
//            }
//        }

//        for(int i=1;i< prices.length;i++){
//            if(prices[i] > prices[i-1]){
//                profit += prices[i] - prices[i-1];
//            }
//        }

        int minSoFar = prices[0];
        int res = 0;


        for (int i = 1; i < prices.length; i++) {

            // Update the minimum value seen so far
            minSoFar = Math.min(minSoFar, prices[i]);

            // Update result if we get more profit
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;

//        return profit;
    }


}
