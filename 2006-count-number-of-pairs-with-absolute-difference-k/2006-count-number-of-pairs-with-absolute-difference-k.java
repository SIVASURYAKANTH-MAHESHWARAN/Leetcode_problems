class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        int i=0;
        int j=1;
        // int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            
            // 
            ans+=map.getOrDefault(num-k,0);
            ans+=map.getOrDefault(num+k,0);
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return ans;
    }
}