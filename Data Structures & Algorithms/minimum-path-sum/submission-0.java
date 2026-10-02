class Solution {
    public int minPathSum(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int[][] dp = new int [m][n];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return dfs(0,0,m,n,grid,dp);
    }
    private int dfs(int i, int j, int m, int n, int[][] grid, int[][] dp){
        if(i>m-1|| j>n-1) return 1000000000;
        if(i==m-1&& j==n-1){
            dp[i][j]= grid[m-1][n-1];
            return dp[i][j];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int x= grid[i][j]+dfs(i+1,j,m,n,grid,dp);
        int y = grid[i][j]+dfs(i,j+1,m,n,grid,dp);
        dp[i][j]=Math.min(x,y);
        return dp[i][j];
    }
}