class Solution {
    public int recurr(int[][]grid,int r,int c,int rlen,int clen,int[][]dp){
        if(rlen-1==r && clen-1==c){
            return grid[r][c];
        }
        if(r>=rlen || c>=clen){
            return Integer.MAX_VALUE;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int r1=recurr(grid,r,c+1,rlen,clen,dp);
        int d1=recurr(grid,r+1,c,rlen,clen,dp);
        return dp[r][c]=grid[r][c]+Math.min(r1,d1);
    }
    public int minPathSum(int[][] grid) {
        int rlen=grid.length;
        int clen=grid[0].length;
        int[][]dp=new int[rlen][clen];
        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                dp[i][j]=-1;
            }
        }
        return recurr(grid,0,0,rlen,clen,dp);
    }
}