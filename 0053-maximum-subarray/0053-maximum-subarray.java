class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            if(sum>=0){
                ans=Math.max(ans,sum);
            }
            else{
                sum=0;
                ans=Math.max(ans,nums[i]);
            }
            System.out.println(ans+" "+i);
        }
        return ans;
    }
}