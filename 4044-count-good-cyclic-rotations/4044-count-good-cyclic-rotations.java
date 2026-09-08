class Solution {
    public int countGoodRotations(int[] nums) {
        int cnt=0;
        int ind1=0;
        int ind2=nums.length/2;
        int n=nums.length;
        long sum1=0;
        long sum2=0;
        for(int i=0;i<n;i++){
            if(i<n/2){
                sum1+=nums[i];
            }
            else{
                sum2+=nums[i];
            }
        }
        // if(sum1>sum2){
        //     cnt++;
        // }
        for(int i=0;i<n/2;i++){
            long var1=nums[ind1];
            long var2=nums[ind2];
            sum1=sum1-var1+var2;
            sum2=sum2-var2+var1;
            if(sum1!=sum2){
                cnt++;
            }
            ind1=(ind1+1)%n;
            ind2=(ind2+1)%n;
        }
        return cnt;
    }
}