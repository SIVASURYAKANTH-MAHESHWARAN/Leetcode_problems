class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=nums[i]-i;
            map.put(val,map.getOrDefault(val,0)+1);
        }
        long goodpairs=0;
        for(int n1:map.keySet()){
            long val=map.get(n1)-1;
            if(val>=1){
            goodpairs+=((long)val*(long)(val+1))/2;
            }
        }
        System.out.println(n);
        n--;
        return (long)((long)n*(long)(n+1))/2-goodpairs;
    }
}