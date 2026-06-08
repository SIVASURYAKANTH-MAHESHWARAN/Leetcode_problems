class Solution {
    public int recurr(int[]cost,int ind,int[]dp){
        if(ind>=cost.length){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        return dp[ind]=Math.min(cost[ind]+recurr(cost,ind+1,dp),cost[ind]+recurr(cost,ind+2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int len=cost.length;
        int[]dp=new int[len];
        Arrays.fill(dp,-1);
        return Math.min(recurr(cost,0,dp),recurr(cost,1,dp));
    }
}