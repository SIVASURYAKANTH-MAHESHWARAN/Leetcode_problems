class Solution {
    public int func(int num,int[]dp){
        if(num<=1){
            return 1;
        }
        if(dp[num]!=-1){
            return dp[num];
        }
        return dp[num]=func(num-1,dp)+func(num-2,dp);
    }
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return func(n,dp);
    }
}