class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ind=0;
        int len=nums.length;
        int cnt=0;
        while(ind<len){
            if(!map.containsKey(nums[ind])){
                map.put(nums[ind],map.getOrDefault(nums[ind],0)+1);
                int val=nums[ind];
                ind++;
                while(ind<len && nums[ind]==val){
                    ind++;
                }
            }
            else{
                map.put(nums[ind],map.getOrDefault(nums[ind],0)+1);
                ind++;
            }
        }
        for(int val:map.keySet()){
            if(map.get(val)==1){
                cnt++;
            }
        }
        return cnt;
    }
}