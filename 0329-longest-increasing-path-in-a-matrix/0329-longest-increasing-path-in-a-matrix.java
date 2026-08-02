class Solution {
    public int dfs(int[][]matrix,int i,int j,Integer[][]dp){
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        int[]dr={-1,1,0,0};
        int[]dc={0,0,1,-1};
        int max=0;
        for(int k=0;k<4;k++){
            int nr=dr[k]+i;
            int nc=dc[k]+j;
            if(nr>=0 && nc>=0 && nr<matrix.length && nc<matrix[0].length && matrix[i][j]<matrix[nr][nc]){
                max=Math.max(max,dfs(matrix,nr,nc,dp));
            }
        }
        return dp[i][j]=1+max;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int ans=0;
        Integer[][]dp=new Integer[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int res=dfs(matrix,i,j,dp);
                ans=Math.max(ans,res);
            }
        }
        return ans;
    }
}