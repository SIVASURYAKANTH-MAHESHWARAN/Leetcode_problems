class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ind=0;
        int n=nums.length;
        Arrays.sort(nums);
        int[]res=new int[n];
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(max,map.get(nums[i]));
        }
        for(int k=0;k<max;k++){
            for(int num:map.keySet()){
                // System.out.println(num);
                if(map.get(num)>0){
                    res[ind++]=num;
                }
                map.put(num,map.get(num)-1);
            }
        }
        return res;
    }
}