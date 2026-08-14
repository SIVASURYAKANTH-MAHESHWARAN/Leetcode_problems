class Solution {
    public int maximalRectangle(char[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        int[][] dp = new int[r][c];

        // dp[i][j] = consecutive 1s ending at (i,j) from the left
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (matrix[i][j] == '1') {
                    if (j == 0)
                        dp[i][j] = 1;
                    else
                        dp[i][j] = dp[i][j - 1] + 1;
                }
            }
        }

        int ans = 0;

        // Treat every row as the bottom row
        // for (int i = 0; i < r; i++) {

        //     for (int j = 0; j < c; j++) {

        //         if (matrix[i][j] == '0')
        //             continue;

        //         int minWidth = Integer.MAX_VALUE;

        //         // Move upward
        //         for (int k = i; k >= 0; k--) {

        //             if (matrix[k][j] == '0')
        //                 break;

        //             minWidth = Math.min(minWidth, dp[k][j]);

        //             int height = i - k + 1;

        //             ans = Math.max(ans, minWidth * height);
        //         }
        //     }
        // }
        for(int i=c-1;i>=0;i--){
            for(int j=r-1;j>=0;j--){
                if(matrix[j][i]=='0'){
                    continue;
                }
                int h=1;
                int res=Integer.MAX_VALUE;
                for(int k=j;k>=0;k--){
                    if(dp[k][i]==0){
                        break;
                    }
                    res=Math.min(res,dp[k][i]);
                    ans=Math.max(ans,res*h);
                    h++;
                }
            }
        }
        return ans;
    }
}