class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int len=nums.length;
        int cnt=0;
        int ans=0;
        for(int right=0;right<len;right++){
            if(nums[right]==1){
                cnt++;
            }
            while(((right-left+1)-cnt)>k){
                if(nums[left]==1){
                    cnt--;
                }
                left++;
            }
            if((right-left+1)>ans){
                ans=right-left+1;
            }
        }
        return ans;
    }
}