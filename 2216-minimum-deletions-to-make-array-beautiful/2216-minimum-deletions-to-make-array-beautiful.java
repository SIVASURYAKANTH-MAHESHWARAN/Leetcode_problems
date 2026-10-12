class Solution {
    public int minDeletion(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n-1;i++){

            if((i+cnt)%2==0){
                int val=nums[i];
                int ind=i+1;
                while(ind<n && nums[ind]==val){
                    ind++;
                    cnt++;
                }
                i=ind;
            }
        }
        return (n-cnt)%2!=0?cnt+1:cnt;
    }
}