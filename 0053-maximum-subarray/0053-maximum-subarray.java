class Solution {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        int s=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            s+=nums[i];
            if(s<0){
                s=0;
                ms=Math.max(ms,nums[i]);            
            }
            else{
            ms=Math.max(ms,s);
            }
        }
        return ms;
    }
}