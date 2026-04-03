class Solution {
    public int maxProfit(int[] prices) {
        int p= 0;
        int minbuy=prices[0];
        for(int sell:prices){
            p= Math.max(p, sell-minbuy);
            minbuy= Math.min(minbuy,sell);
        }
        return p;
    }
}
