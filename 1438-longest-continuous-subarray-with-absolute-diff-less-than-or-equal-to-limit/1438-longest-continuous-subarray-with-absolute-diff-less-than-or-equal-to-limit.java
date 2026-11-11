class Solution {
    public int longestSubarray(int[] nums, int k) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        int j=0;
        int i=0;
        int n=nums.length;
        int ans=0;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            long diff=Math.abs(map.firstKey()-map.lastKey());
            while(diff>k){
                
             
                int cnt=map.get(nums[i]);
                if(cnt==1){
                    map.remove(nums[i]);
                }
                else{
                    map.put(nums[i],cnt-1);
                }
                i++;
                diff=Math.abs(map.firstKey()-map.lastKey());
                // System.out.println("hi"+" "+diff);
            }
           
            // System.out.println(map.firstKey()+" "+map.lastKey()+" "+diff);
            ans=Math.max(ans,j-i+1);
            
            // System.out.println(i+" "+j);
            j++;
        }
        return ans;
    }
}