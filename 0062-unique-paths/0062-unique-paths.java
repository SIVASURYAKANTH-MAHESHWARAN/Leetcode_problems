class Solution {
    public int recurr(int m,int n,int r,int c,int[][]dp){

        if(m==r && n==c){
            return 1;
        }
        if(c>n||r>m){
            return 0;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int right=recurr(m,n,r,c+1,dp);
        int down=recurr(m,n,r+1,c,dp);
        return dp[r][c]=right+down;
    }
    public int uniquePaths(int m, int n) {
        int[][]dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return recurr(m,n,1,1,dp);
    }
}