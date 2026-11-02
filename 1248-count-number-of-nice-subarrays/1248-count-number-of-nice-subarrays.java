class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int oddcnt=0;
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                oddcnt++;
            }
            cnt+=map.getOrDefault(oddcnt-k,0);
            map.put(oddcnt,map.getOrDefault(oddcnt,0)+1);
        }
        return cnt;
    }
}