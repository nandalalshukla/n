class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] dp = new int[text1.length()][text2.length()];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return dfs(text1,text2,0,0,dp);
    }
    private int dfs(String t1, String t2, int i, int j, int[][] dp){
        if(i==t1.length()||j==t2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j)){
            dp[i][j]=1+dfs(t1,t2,i+1,j+1,dp);
        }
        else{
            dp[i][j]=Math.max(dfs(t1,t2,i+1,j,dp),dfs(t1,t2,i,j+1,dp));
        }
        return dp[i][j];
    }
}
