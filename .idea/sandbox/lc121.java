package sandbox;

public class lc121 {
        public static void main(String[] args) {
            int[] nums = {7,6,4,3,1};

            lc121 lc121 = new lc121();

            int res = lc121.maxProfit(nums);
            System.out.println(res);

        }

        public int maxProfit(int[] prices) {
            int maxProfit = 0;

        //bruce force
        for (int buy = 0; buy < prices.length; buy++) {
            for (int sell = buy+1; sell < prices.length; sell++) {
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit, maxProfit);
            }
        }

        return maxProfit;
        }
     
}
