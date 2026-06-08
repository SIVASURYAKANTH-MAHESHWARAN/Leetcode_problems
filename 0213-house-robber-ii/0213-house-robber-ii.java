class Solution {
    
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[]dp=new int[n];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<n;i++){
            dp[i]=Math.max(nums[i-1]+dp[i-2],dp[i-1]);
        }
        int[]dp1=new int[n];
        dp1[0]=0;
        dp1[1]=nums[1];
        for(int i=2;i<n;i++){
            dp1[i]=Math.max(nums[i]+dp1[i-2],dp1[i-1]);
        }
        return Math.max(dp[n-1],dp1[n-1]);
    }
}