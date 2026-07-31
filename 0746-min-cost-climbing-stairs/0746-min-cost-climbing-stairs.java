class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n+2];
        dp[1]=cost[0];
        dp[2]=cost[1];
        for(int i=3;i<=n+1;i++){
            dp[i]=(i<=n)?(Math.min(dp[i-1],dp[i-2]))+cost[i-1]:Math.min(dp[i-1],dp[i-2]);
        }
        // for(int i=1;i<=n;i++)
        return dp[n+1];
    }
}