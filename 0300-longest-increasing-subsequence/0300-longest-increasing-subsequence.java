class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int[]dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            int max=dp[i];
           for(int j=i-1;j>=0;j--){
            if(arr[i]>arr[j]){
            max=Math.max(max,dp[j]+1);
            }
           }
           dp[i]=max;
        }
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}