class Solution {
    public int lastStoneWeightII(int[] stones) {
        int stonesWeight =0;
        for(int s: stones){
            stonesWeight+=s;
        }
        int target = stonesWeight/2;
        int [][] dp = new int[stones.length][target+1];
        for(int [] a: dp){
            Arrays.fill(a,-1);
        }
        return dfs(0,0, stonesWeight,target, stones,dp);
    }
    private int dfs(int i, int currSum,int stonesWeight, int target, int[] nums, int[][] dp){
        if(currSum>=target || i>=nums.length){
           return Math.abs(currSum -(stonesWeight-currSum));
        }
        if(dp[i][currSum]!=-1) return dp[i][currSum];
         dp[i][currSum]=Math.min(
        dfs(i+1,currSum+nums[i],stonesWeight,target,nums,dp),
        dfs(i+1,currSum,stonesWeight,target,nums,dp));
        return dp[i][currSum];
    }
}