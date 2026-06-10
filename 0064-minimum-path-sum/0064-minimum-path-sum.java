class Solution {
    public int minPathSum(int[][] grid) {
        int rlen=grid.length;
        int clen=grid[0].length;
        int[][]dp=new int[rlen][clen];
        dp[0][0]=grid[0][0];
        for(int i=1;i<clen;i++){
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        for(int i=1;i<rlen;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }

        for(int i=1;i<rlen;i++){
            for(int j=1;j<clen;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[rlen-1][clen-1];
    }
}