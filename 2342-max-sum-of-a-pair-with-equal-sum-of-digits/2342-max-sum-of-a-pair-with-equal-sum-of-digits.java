class Solution {
    public int func(int val){
        int num=0;
        while(val!=0){
            num+=val%10;
            val/=10;
        }
        return num;
    }
    public int maximumSum(int[] nums) {
        Arrays.sort(nums);
        int res=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
            int ans=func(val);
            // int[]arr=map.get(val);
            // if(map.containsKey(ans)){
            //     res=Math.max(res,map.get(ans));
            // }
            // map.put(ans,map.getOrDefault(ans,0)+val);
            if(!map.containsKey(ans)){
                map.put(ans,val);
            }
            else{
                res=Math.max(res,map.get(ans)+val);
                map.put(ans,val);
            }
            
        }
        return res;
    }
}