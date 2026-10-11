class Solution {
    public int[] numberOfPairs(int[] nums) {
        int cnt1=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val)==2){
                cnt1++;
                map.put(val,0);
            }
        }
        int cnt2=0;
        for(int val:map.keySet()){
            if(map.get(val)==1){
                cnt2++;
            }
        }
        return new int[]{cnt1,cnt2};
    }
}