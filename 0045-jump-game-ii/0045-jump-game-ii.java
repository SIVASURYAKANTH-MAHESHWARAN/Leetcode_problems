class Solution {
    public int jump(int[] nums) {
        int steps=0;
        int mr=0;
        int pm=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            pm=Math.max(pm,i+nums[i]);     
            if(i==mr){
                steps++;
                // mr=Math.max(mr,i+nums[i]);
                mr=pm;
            }
        }
        return steps;
    }
}