class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstlen, int secondlen) {
        int n=nums.length;
        int[]pre=new int[n+1];
        Arrays.fill(pre,0);
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+nums[i];
        }
        int ans=0;
        for(int i=0;i<=n-firstlen;i++){
            int sum1=pre[i+firstlen]-pre[i];
            for(int j=0;j<=n-secondlen;j++){
                if(i+firstlen<=j||j+secondlen<=i){
                    int sum2=pre[j+secondlen]-pre[j];
                    // if(sum1+sum2>ans){
                    //     System.out.println(j+" "+i);
                    // }
                    ans=Math.max(ans,sum1+sum2);
                }
            }
        }
        return ans;
    }
}