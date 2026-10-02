class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int [][] dp = new int[m][n];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return dfs(0,0,m,n,obstacleGrid, dp);
    }
    private int dfs(int i,int j, int m,int n, int[][] og, int[][] dp){
        if(i>m-1||j>n-1|| og[i][j]==1) return 0;
        if(i==m-1&& j==n-1) {
            dp[i][j]=1;
            return dp[i][j];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int x= dfs(i+1,j,m,n,og,dp);
        int y=dfs(i,j+1,m,n,og,dp);
        dp[i][j]=x+y;
        return dp[i][j];
    }
}