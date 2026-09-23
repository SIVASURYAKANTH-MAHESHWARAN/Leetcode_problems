class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[][]mat=new int[101][3];
        int[]cnt=new int[101];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int var=nums[i];
            if(cnt[var]<=2){
              mat[var][cnt[var]]=i;
            }
            cnt[var]++;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(cnt[nums[i]]==3){
                int num=nums[i];
                int l1=mat[num][0];
                int l2=mat[num][1];
                int l3=mat[num][2];
                if(l2-l1==l3-l2){
                    count++;
                }
                cnt[nums[i]]=-1;
            }
        }
        return count;
    }
}