class Solution {
    public int gcd(int num1,int num2){
        if(num1==0){
            return num2;
        }
        if(num1<num2){
            return gcd(num2%num1,num1);
        }
        else{
        return gcd(num1%num2,num2);
        }
    }
    public int resilientSubarray(int[] nums, int k) {
        int n=nums.length;
        int ans=1;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i]%k;
        }
        int i=0;
        while(i<=n-1){
            int j=i;
            while(j<n-1 && arr[j]==arr[j+1]){
                j++;
            }
            int r=arr[j];
            int x=(j-i)+1;
            int d=k/gcd(r,k);
            int l=(x-1)/d+1;
            int an=1+(l-1)*d;
            ans=Math.max(ans,an);
            i=j+1;
        }
        return ans;
    }
}