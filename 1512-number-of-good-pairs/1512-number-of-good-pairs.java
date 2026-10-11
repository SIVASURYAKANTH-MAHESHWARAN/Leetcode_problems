class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int ans=0;
        for(int val:map.keySet()){
            int n=map.get(val)-1;
            ans+=(n*(n+1))/2;
        }
        return ans;
    }
}