class Solution {
    public int func(int[]nums,int curr,int[]memo){
        if(curr>=nums.length){
            return 0;
        }
        if(curr==nums.length-1){
            return 1;
        }
        if(memo[curr]!=-1){
            return memo[curr];
        }
        int flag=0;
        for(int i=1;i<=nums[curr];i++){
            flag=func(nums,curr+i,memo);
            // System.out.print(flag+" "+i);
               if(flag==1){
                    return memo[curr]=1;
                    // return true;
                }
        }
        // if(!memo[ind]){
        //     return memo[ind];
        // }
        memo[curr]=0;
        return memo[curr];
    }
    public boolean canJump(int[] nums) {
        int[]memo=new int[nums.length+1];
        
            for(int j=0;j<=nums.length;j++){
                memo[j]=-1;
            }
        
        // Arrays.fill(memo,-1);
        boolean flag=false;
        //     for(int i=0;i<=nums.length;i++){
        //     for(int j=0;j<=nums.length;j++){
        //         if(memo[i][j]==1){
        //             return true;
        //         }
        //     }
        // }
        return func(nums,0,memo)==1?true:false;
    }
}