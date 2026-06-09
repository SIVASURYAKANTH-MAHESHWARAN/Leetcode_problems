class Solution {
    public int change(int amount, int[] coins) {
        int[]dp=new int[amount+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        int len=coins.length;
        for(int i=0;i<len;i++){
            int coin=coins[i];
            for(int j=coin;j<=amount;j++){
                dp[j]+=dp[j-coin];
            }
        }
        return dp[amount];
    }
}