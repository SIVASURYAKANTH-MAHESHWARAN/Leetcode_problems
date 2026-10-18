class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int n=nums.length;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i]%k;
        }
        int i=0;
        int ans=1;
        while(i<=n-1){
            int s=nums[i];
            int j=i+1;
            while(j<=n-1 && arr[j-1]==arr[j]){
                s+=nums[j];
                // System.out.println(j);
                if(s%k==arr[j]){
                    // System.out.println(j+" "+s);
                    ans=Math.max(ans,j-i+1);
                }
                // System.out.println(s);
                 j++;
            }
            i=j;
        }
        return ans;
    }
}