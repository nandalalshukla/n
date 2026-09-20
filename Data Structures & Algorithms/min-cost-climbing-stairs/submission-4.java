class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        int c0 = bt(0,cost,dp);
        int c1=bt(1,cost,dp);
        return Math.min(c0,c1);
    }
    private int bt(int i, int[] cost, int[] dp){
        if(i>=cost.length) return 0;

        if(dp[i]!=-1) return dp[i];

        dp[i]= cost[i]+Math.min(bt(i+1,cost,dp),bt(i+2,cost,dp));
        return dp[i];
        
        
    }
}
