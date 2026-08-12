class Solution {
    public boolean valid(int k,int[][]dp){
        int r=dp.length;
        int c=dp[0].length;
        int minr=Integer.MAX_VALUE;
        int maxr=-1;
        int minc=Integer.MAX_VALUE;
        int maxc=-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(dp[i][j]>=k){
                    minr=Math.min(i,minr);
                    maxr=Math.max(i,maxr);
                    minc=Math.min(j,minc);
                    maxc=Math.max(j,maxc);
                }
            }
        }
        if((maxr-minr>=k)||(maxc-minc>=k)){
            return true;
        }
        return false;
    }
    public int maxArea(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int[][]dp=new int[r+1][c+1];
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                if(mat[i][j]==1){
                    dp[i][j]=1+Math.min(Math.min(dp[i][j+1],dp[i+1][j]),dp[i+1][j+1]);
                }
            }
        }
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int len=Math.min(r,c);
        int low=1;
        int high=len;
        while(low<=high){
            int mid=(low+high)/2;
            if(valid(mid,dp)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high*high;
    }
}