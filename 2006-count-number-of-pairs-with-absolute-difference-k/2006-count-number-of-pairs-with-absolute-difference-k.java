class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        int i=0;
        int j=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum=Math.abs(nums[j]-nums[i]);
            while(sum>k){
                // int cnt=map.get(nums[i]);
                // if(cnt==1){
                //     map.remove(nums[i]);
                // }
                // else{
                //     map.put(nums[i],map.get(nums[i])-1);
                // }
                i++;
                sum=Math.abs(nums[j]-nums[i]);
            }
            if(sum==k){
                System.out.println(nums[i]+" "+i+" "+j);
                ans+=map.get(nums[i]);
            }
            j++;
        }
        return ans;
    }
}