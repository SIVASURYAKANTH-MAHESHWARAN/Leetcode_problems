class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ind=0;
        Arrays.sort(nums);
        int n=nums.length;
        int[]res=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=-1){
            int prev=nums[i];
            // nums[i]=-1;
            for(int j=i;j<n;j++){
                if(i!=j && (prev==nums[j]||nums[j]==-1)){
                    continue;
                }    
                prev=nums[j];
                // System.out.println(ind+" ");
                res[ind]=nums[j];
                nums[j]=-1;
                ind++;
            }
            }
        }
        return res;
    }
}