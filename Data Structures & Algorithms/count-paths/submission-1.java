class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return dfs(0,0, m,n,dp);
    }
    private int dfs(int i, int j , int m ,int n, int[][]dp){
       
        if(i==m-1 && j==n-1) {
            dp[i][j]= 1;
            return dp[i][j];
        }
        if(i>m-1 || j>n-1) return 0;
         if(dp[i][j]!=-1) return dp[i][j];
        
        int x=dfs(i+1,j,m,n,dp);
        int y=dfs(i,j+1,m,n,dp);
        dp[i][j]= x+y;
        return dp[i][j];
    }
}
