class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>lis=new ArrayList<>();
        for(int val:nums){
            int ind=Math.abs(val);
            if(nums[ind-1]>0){
                nums[ind-1]=nums[ind-1]*-1;
            }
        }
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]>0){
                lis.add(i+1);
            }
        }
        return lis;
    }
}