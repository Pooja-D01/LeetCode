class Solution {
    public int maxProfit(int[] prices) {
        // int min = prices[0];
        // int index = 0;
        // int max = 0;
        
        // for (int i = 0; i < prices.length; i++) {
        //     if (prices[i] < min) {
        //         min = prices[i];
        //         index = i;
        //     }
        // }

        // for (int j = index; j < prices.length; j++) {
        //     if (prices[j] - min > max) {
        //         max = prices[j] - min;
        //     }
        // }

        // return max;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;

    }
}
