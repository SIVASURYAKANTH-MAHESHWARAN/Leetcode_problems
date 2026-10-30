class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        // if(n==1){
        //     return 1;
        // }
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int val:nums){
            set1.add(val);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int val=nums[i]-1;
            // if(val==-1){

            // }
            if(!set1.contains(val) && !set2.contains(val+1)){
                val++;
                set2.add(val);
                int cnt=0;
                while(set1.contains(val)){
                    val++;
                    cnt++;
                }
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}