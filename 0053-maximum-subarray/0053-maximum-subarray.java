class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        int len=nums.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            if(sum<0){
                res=Math.max(res,nums[i]);
                sum=0;
            }
            else{
                res=Math.max(res,sum);
            }
        }
        return res;
    }
}