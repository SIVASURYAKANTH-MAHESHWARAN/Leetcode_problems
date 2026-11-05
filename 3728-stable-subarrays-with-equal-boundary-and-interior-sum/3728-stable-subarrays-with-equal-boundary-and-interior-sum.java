class Solution {
    public long countStableSubarrays(int[] capacity) {
        int n=capacity.length;
        Map<List<Long>,Integer>map=new HashMap<>();
        long sum=0;
        long ans=0;
        for(int i=0;i<n;i++){
            sum+=capacity[i];
            if(i>=2){
            List<Long>lis=new ArrayList<>();
            lis.add(sum-capacity[i]-capacity[i-1]);
            lis.add((long)capacity[i-2]);
            map.put(lis,map.getOrDefault(lis,0)+1); 
            List<Long>lis1=new ArrayList<>();
            lis1.add(0,sum-2L*capacity[i]);
            lis1.add(1,(long)capacity[i]);
            if(map.containsKey(lis1)){
                ans+=map.get(lis1);
            }
                 
            }
        }
        return ans;
    }
}