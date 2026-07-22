class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int len=nums.length;
        // int[]arr=new int[len*2];
        // for(int i=0;i<len*2;i++){
        //     arr[i]=nums[i%len];
        // }
        // for(int i=0;i<len*2;i++){
        //     System.out.print(arr[i]+" ");
        // }


        int s=0;
        int mxs=Integer.MIN_VALUE;
        // int cm==0;
        for(int i=0;i<len;i++){
            s+=nums[i];
            if(s<0){
                s=0;
                mxs=Math.max(mxs,nums[i]);
            }
            else{
                mxs=Math.max(mxs,s);
            }
          
        }
        int ts=0;
        for(int i=0;i<len;i++){
            ts+=nums[i];
        }
        s=0;
        int mns=Integer.MAX_VALUE;
    
        for(int i=0;i<len;i++){
            s+=nums[i];
            if(s>0){
                s=0;
                mns=Math.min(mns,nums[i]);
            }
            else{
                mns=Math.min(mns,s);
            }
        }
        if(mxs<0){
             return mxs;
        }
        return Math.max(mxs,(ts-mns));
        // return mxs;
    }
}