class Solution {
    public int recurr(int ind,int[]coins,int amt,int[][]dp){
        if(ind==0){
            if(amt%coins[0]==0){
                return amt/coins[0];
            }
            else{
                return Integer.MAX_VALUE;
            }
        }
        if(dp[ind][amt]!=-1){
            return dp[ind][amt];
        }
        int not_take=recurr(ind-1,coins,amt,dp);
        int take=Integer.MAX_VALUE;
        if(coins[ind]<=amt){
            int takes=recurr(ind,coins,amt-coins[ind],dp);
            if(takes!=Integer.MAX_VALUE){
                take=1+takes;
            }
        }
        return dp[ind][amt]=Math.min(not_take,take);
    }
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[][]dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
                dp[i][j]=-1;
            }
        }
        int ans=recurr(coins.length-1,coins,amount,dp);
        return (ans==Integer.MAX_VALUE)?-1:ans;   
    }
}