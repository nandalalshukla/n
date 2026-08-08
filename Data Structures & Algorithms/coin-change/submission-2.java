class Solution {
    public int coinChange(int[] coins, int amount) {
        int [][] dp = new int [coins.length][amount+1];
        for(int a=0;a<=amount;a++){
            if(a%coins[0]==0){
                dp[0][a]=a/coins[0];

            }else{
                dp[0][a]=(int)1e9;
            }
        }
       
        for(int i=1;i<coins.length;i++){
             int pick = (int)1e9;
            for(int a=0;a<=amount;a++){
                if(a>=coins[i]){
                    pick = 1+ dp[i][a-coins[i]];
                }
                int nopick = dp[i-1][a];
                dp[i][a]= Math.min(pick,nopick);
            }
        }
        if(dp[coins.length-1][amount]==(int)1e9) return -1;
        return dp[coins.length-1][amount];
    }
}
