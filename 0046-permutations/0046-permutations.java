class Solution {
    public void recurr(int[]nums,List<Integer>lis,List<List<Integer>>res){
        if(lis.size()==nums.length){
            res.add(new ArrayList<>(lis));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(lis.contains(nums[i])){
                continue;
            }
            lis.add(nums[i]);
            recurr(nums,lis,res);
            lis.remove(lis.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        recurr(nums,new ArrayList<>(),res);
        return res;
    }
}