class Solution {
    public int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(Math.min(x,y),Math.max(x,y)%Math.min(x,y));
    }
    public int func(List<Integer>lis){
        int n=lis.size();
        int cnt=0;
        // for(int i=0;i<n;i++){
        //     int left=lis.get(0);
        //     for(int ind=1;ind<=i;ind++){
        //         left=gcd(left,lis.get(ind));
        //     }
        //     int right=-1;
        //     if(i<n-1){
        //     right=lis.get(i+1);
        //     for(int ind=i+2;ind<n;ind++){
        //         right=gcd(right,lis.get(ind));
        //     }
        // }
        //     if(left==right){
        //         cnt++;
        //     }
        // }
        int[]left=new int[n];
        left[0]=lis.get(0);
        for(int i=1;i<n;i++){
            left[i]=gcd(left[i-1],lis.get(i));
        }
        int[]right=new int[n];
        right[n-1]=lis.get(n-1);
        for(int i=n-2;i>=0;i--){
            right[i]=gcd(right[i+1],lis.get(i));
        }
        for(int i=0;i<n-1;i++){
            int x=left[i];
            int y=right[i+1];
            if(x==y){
                cnt++;
            }
        }
        return cnt;
    }
    public int maxValidSplits(int[] nums) {
        List<Integer>lis=new ArrayList<>();
        int len=nums.length;
        int ans=0;
        for(int i=0;i<len;i++){
            lis.add(nums[i]);
        }
        ans=Math.max(ans,func(lis));
        for(int i=0;i<len;i++){
            lis=new ArrayList<>();
            for(int j=0;j<len;j++){
                if(i==j){
                    continue;
                }
                else{
                    lis.add(nums[j]);
                }
            }
            ans=Math.max(ans,func(lis));
        }
        return ans;
    }
}