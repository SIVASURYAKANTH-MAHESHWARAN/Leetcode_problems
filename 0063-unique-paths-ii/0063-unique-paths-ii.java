class Solution {
    public int recurr(int[][]arr,int r,int c,int[][]dp){
        if(r==arr.length-1 && c==arr[0].length-1 && arr[r][c]!=1){
            return 1;
        }
        if(r>=arr.length||c>=arr[0].length||arr[r][c]==1){
            return 0;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int right=recurr(arr,r,c+1,dp);
        int down=recurr(arr,r+1,c,dp);
        return dp[r][c]=right+down;
    }
    public int uniquePathsWithObstacles(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        int[][]dp=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dp[i][j]=-1;
            }
        }
        return recurr(arr,0,0,dp);
       
    }
}