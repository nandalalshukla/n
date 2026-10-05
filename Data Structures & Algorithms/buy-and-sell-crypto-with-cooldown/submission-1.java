class Solution {
    HashMap<String,Integer> dp;
    public int maxProfit(int[] prices) {
        dp= new HashMap<>();
        return dfs(0,true,prices);
    }
    private int dfs(int i, boolean canBuy, int[] prices){
        if(i>=prices.length) return 0;
        String key= i+"-"+canBuy;
        if(dp.containsKey(key)) return dp.get(key);
        int skiptoday = dfs(i+1,canBuy, prices);
        if(canBuy){
            int buy = dfs(i+1,false,prices)-prices[i];
            dp.put(key,Math.max(buy,skiptoday)) ;
        }else{
            int sell= prices[i]+dfs(i+2,true,prices);
            dp.put(key,Math.max(sell,skiptoday)) ;
        }
        return dp.get(key);
    }
}
