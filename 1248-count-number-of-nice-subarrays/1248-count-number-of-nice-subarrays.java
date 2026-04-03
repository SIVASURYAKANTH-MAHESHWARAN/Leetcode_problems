class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int cnt=0;
        int odd=0;
        int len=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<len;i++){
            if(nums[i]%2!=0){
                odd++;
            }
            if(map.containsKey(odd-k)){
            cnt+=map.get(odd-k);
            }
            map.put(odd,map.getOrDefault(odd,0)+1);
        }
        return cnt;
    }
}