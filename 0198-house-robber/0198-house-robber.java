class Solution {
    public int recurr(int[]nums,int len,int ind,int[]dp){
        if(ind>=len){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int take=nums[ind]+recurr(nums,len,ind+2,dp);
        int not_take=recurr(nums,len,ind+1,dp);
        return dp[ind]=Math.max(take,not_take);
    }
    public int rob(int[] nums) {
        int len=nums.length;
        int[]dp=new int[len];
        Arrays.fill(dp,-1);
        return recurr(nums,len,0,dp);
    }
}