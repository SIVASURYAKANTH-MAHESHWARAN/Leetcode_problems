class Solution {
    public int countSquares(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][]dp=new int[r+1][c+1];
        int res=0;
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                if(matrix[i][j]!=0){
                    dp[i][j]=1+Math.min(Math.min(dp[i][j+1],dp[i+1][j+1]),dp[i+1][j]);
                    res+=dp[i][j];
                }
            }
        }
      
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        return res;
    }
}