class Solution {
    public int lengthOfLIS(int[] nums) {
     int len=nums.length; 
     int[]dp=new int[len+1];
    //  Arrays.fill(dp,1);
    dp[0]=1;
     for(int i=1;i<len;i++){
       
            int ans=Integer.MIN_VALUE;
            int ind=i;
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    if(dp[j]>ans ){
                        ans=dp[j];
                        ind=j;
                    }
                }
            }
            dp[i]=dp[ind]+1;
        }
        // else{
        //     // int ind=i;
        //     // int ans=1;
        //     // while(ind>0 && nums[ind]>=0){
        //     //     if(nums[i]>nums[ind]){
        //     //         ans=dp[ind];
        //     //         break;
        //     //     }
        //     //     ind--;
        //     // }
        //     // dp[i]=ans;
        //     dp[i]=1;
        // }
        // for(int i=0;i<len;i++){
        //     System.out.print(dp[i]+" ");
        // }
     int ans=Integer.MIN_VALUE;
     for(int i=0;i<len;i++){
        ans=Math.max(ans,dp[i]);
     }
     return ans;   
    }
}