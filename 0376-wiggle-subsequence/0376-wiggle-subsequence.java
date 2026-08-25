class Solution {
    public int solve(int len,int prev,int ind,int sign,int[]nums,int[][][]dp){
        if(ind==nums.length){
            return len;
        }
        if(dp[ind][prev][sign]!=-1){
            return dp[ind][prev][sign]+len;
        }
        int take=0;
        int not=0;
        // if(sign=="ANY"){
        // if(nums[ind]>prev){
        //     take=solve(len+1,nums[ind],ind+1,"NEG",nums);
        // }
        // not=solve(len,nums[ind],ind+1,)
        // }
        if(sign==0){
            if(nums[ind]>nums[prev]){
                take=solve(len+1,ind,ind+1,1,nums,dp);
            }
            not=solve(len,prev,ind+1,0,nums,dp);
        }
        else{
            if(nums[ind]<nums[prev]){
                take=solve(len+1,ind,ind+1,0,nums,dp);
            }
            not=solve(len,prev,ind+1,1,nums,dp);
        }
        int ans=Math.max(take,not);
        dp[ind][prev][sign]=ans-len;
        return ans;
    }
    public int wiggleMaxLength(int[] nums) {
        int ans=0;
        int[][][]dp=new int[nums.length+1][nums.length+1][2];
    for(int i=0;i<nums.length+1;i++){
        for(int j=0;j<nums.length+1;j++){
            for(int k=0;k<2;k++){
                dp[i][j][k]=-1;
            }
        }
    }
        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,Math.max(solve(1,i,i+1,0,nums,dp),solve(1,i,i+1,1,nums,dp)));
        }
        return ans;
    }
}