class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int mf=0;
        int ans=0;
        int n=nums.length;
        for(int right=0;right<n;right++){
            if(nums[right]==1){
                mf++;
            }
            int wlen=right-left+1;
            int res=wlen-mf;
            if(res>1){
                if(nums[left]==1){
                    mf--;
                }
                left++;
            }
            else{
                ans=Math.max(ans,wlen);
            }
        }
        if(ans==0){
            return 0;
        }
        return ans-1;
    }
}