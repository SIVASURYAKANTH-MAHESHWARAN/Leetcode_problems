class Solution {
    int[][]dr={{-1,0},{1,0},{0,1},{0,-1}};
    public int dfs(int[][]mat,int[][]dp,int i,int j){
        int ans=1;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        for(int[]dx:dr){
            int r=dx[0]+i;
            int c=dx[1]+j;
            if(r>=0 && c>=0 && r<mat.length && c<mat[0].length && mat[r][c]>mat[i][j]){
                ans=Math.max(ans,1+dfs(mat,dp,r,c));
            }

        }
        return dp[i][j]=ans;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int max=1;
        int[][]dp=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dp[i][j]=-1;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                max=Math.max(max,dfs(matrix,dp,i,j));
            }
        }
        return max;
    }
}