class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     HashMap<Integer,Integer>map=new HashMap<>();
     map.put(0,1);
     int cnt=0;
     int len=nums.length;
     int sum=0;
     for(int i=0;i<len;i++){
        sum+=nums[i];
        int rem=(sum%k+k)%k;
        if(map.containsKey(rem)){
            
            cnt+=map.get(rem);
        }
        map.put(rem,map.getOrDefault(rem,0)+1);
     }    
     return cnt;   
    }

}