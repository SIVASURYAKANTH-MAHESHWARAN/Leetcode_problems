class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int ans=0;
        int mf=0;
        int n=nums.length;
        for(int right=0;right<n;right++){
            if(nums[right]==1){
                mf++;
            }
            int wlen=right-left+1;
            int rem=wlen-mf;
            if(rem>k){
                if(nums[left]==1){
                    mf--;
                }
                left++;
            }
            else{
                ans=Math.max(ans,wlen);
            }
        }
        return ans;   
    }
}