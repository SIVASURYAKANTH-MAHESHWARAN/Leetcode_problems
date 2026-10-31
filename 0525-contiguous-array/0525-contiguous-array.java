class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                sum-=1;
            }
            else{
                sum++;
            }
            // sum+=(nums[i]-1);
            if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return ans;
    }
}