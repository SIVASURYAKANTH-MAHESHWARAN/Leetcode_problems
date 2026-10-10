class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int cnt1=0;
         int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                cnt1++;
            }
        }
        HashMap<String,Integer>map=new HashMap<>();
       
        int max=0;
        for(int i=0;i<n-1;i++){
            int num1=nums[i];
            int num2=nums[i+1];
            if(num1!=num2){
            List<Integer>lis=new ArrayList<>();
            lis.add(num1);
            lis.add(num2);
            Collections.sort(lis);
            String str="";
            for(int val:lis){
                str+=val;
                str+=',';
            }
            map.put(str,map.getOrDefault(str,0)+1);
            max=Math.max(max,map.get(str));
            }
        }
        return cnt1+max;
    }
}