class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(map.get(nums[i]),max);
        }
        for(int i=0;i<max;i++){
            List<Integer>lis=new ArrayList<>();
            for(int num:map.keySet()){
                if(map.get(num)>0){
                    lis.add(num);
                    map.put(num,map.get(num)-1);
                }
            }
            if(!lis.isEmpty()){
            res.add(lis);
            }
        }
        return res;
    }
}