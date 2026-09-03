class Solution {
    public int jump(int[] nums) {
        int far=0;
        int currend=0;
        int steps=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            far=Math.max(far,i+nums[i]);
            if(i==currend){
                steps++;
                currend=far;
            }
        }
        return steps;
    }
}