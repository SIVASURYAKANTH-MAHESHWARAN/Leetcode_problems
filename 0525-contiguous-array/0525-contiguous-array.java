class Solution {
    public int findMaxLength(int[] nums) {
        int len=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int cnt=0;
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<len;i++){
            if(nums[i]==0){
                sum+=-1;
            }
            else{
                sum+=1;
            }
            if(map.containsKey(sum)){
                cnt=Math.max(i-map.get(sum),cnt);
            }
            else{
                map.put(sum,i);
            }
        }
        return cnt;
    }
}