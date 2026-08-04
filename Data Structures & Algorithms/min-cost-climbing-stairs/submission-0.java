class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(rec(dp,cost,0),rec(dp,cost,1));
    }
    public int rec(int[] dp, int[] cost,int i){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        dp[i]= cost[i]+Math.min(rec(dp,cost,i+1), rec(dp,cost,i+2));
        return dp[i];
    }
}
