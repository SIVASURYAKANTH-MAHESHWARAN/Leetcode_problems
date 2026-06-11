class Solution {
    public long recurr(int[][]questions,int ind,long[]dp){
        if(ind>=questions.length){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        long take=questions[ind][0]+recurr(questions,ind+questions[ind][1]+1,dp);
        long not_take=recurr(questions,ind+1,dp);
        return dp[ind]=Math.max(take,not_take);
    }
    public long mostPoints(int[][] questions) {
        long[]dp=new long[questions.length];
        Arrays.fill(dp,-1);
        return recurr(questions,0,dp);
    }
}