class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans=Long.MIN_VALUE;
        long sum=0;
        Map<Integer,Long>map=new HashMap<>();
        int len=nums.length;

        for(int i=0;i<len;i++){
            if(map.containsKey(k+nums[i])){
                ans=Math.max(ans,(sum+nums[i])-map.get(k+nums[i]));
            }
            if(map.containsKey(nums[i]-k)){
                // System.out.println("hi");
                ans=Math.max(ans,(sum+nums[i])-map.get(nums[i]-k));
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i],sum);
            }
            else{
                map.put(nums[i],Math.min(map.get(nums[i]),sum));
            }
            sum+=nums[i];
        }
        return ans==Long.MIN_VALUE?0:ans;
    }
}