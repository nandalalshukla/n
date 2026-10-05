class Solution {
    int [][] dp;
    public int change(int amount, int[] coins) {
        dp = new int[coins.length][amount+1];
        for(int [] a: dp){
            Arrays.fill(a,-1);
        }
        return dfs(coins, 0, amount);
    }
    private int dfs(int[] coins, int i, int amount){
        if(i==coins.length-1){
            if(amount%coins[i]==0){
                dp[i][amount]=1;
                return 1;
            }else{
                dp[i][amount]=0;
                return 0;
            }
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        int pick = 0;
        if(amount>=coins[i]){
            pick = dfs(coins,i,amount-coins[i]);
        }
        int nopick = dfs(coins,i+1,amount);
        dp[i][amount] =pick+nopick;
        return dp[i][amount];

    }
}
