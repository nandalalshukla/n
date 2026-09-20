class Solution {
    int[] dp;
    public int rob(int[] nums) {
        int n= nums.length;
        
        dp=new int[n];
        Arrays.fill(dp,-1);

        return bt(0,nums);
    }
    private int bt(int i,int[]nums){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];

        dp[i]= Math.max(bt(i+1,nums), nums[i]+bt(i+2,nums));
        return dp[i];
    }
}
