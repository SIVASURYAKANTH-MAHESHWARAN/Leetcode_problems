class Solution {
    // public void rev(int[][]grid,int row,int col){

    // }
    public void ls(int[][]grid,int row,int k){
        int n=grid.length;
        // int ind=0;
        // while(ind<=len){
        //     int tem=grid[row][ind];
        //     grid[row][ind]=grid[row][len];
        //     grid[row][len]=tem;
        //     ind++;
        //     len--;
        // }
        // len=k-1;
        // ind=0;
        // while(ind<=len){
        //     int tem=grid[row][ind];
        //     grid[row][ind]=grid[row][len];
        //     grid[row][len]=tem;
        //     ind++;
        //     len--;
        // }
        // for(int i=0;i<N;i++){
        //     for(int j=0;j<N;j++){
        //         grid[i][j]=-1;
        //     }
        // }
        int[]arr=new int[n];
        int ind=0;
        for(int i=k;i<k+n;i++){
            arr[ind]=grid[row][i%n];
            ind++;
        }
        for(int i=0;i<n;i++){
            grid[row][i]=arr[i];
        }
    }
    public void us(int[][]grid,int col,int k){
        int n=grid.length;
        int[]arr=new int[n];
        int ind=0;
        for(int i=k;i<k+n;i++){
            arr[ind]=grid[i%n][col];
            ind++;
        }
        for(int i=0;i<n;i++){
            grid[i%n][col]=arr[i];
        }
    }
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i=0;i<n;i++){
            ls(grid,i,rowShift[i]);
        }
        for(int i=0;i<n;i++){
            us(grid,i,colShift[i]);
        }
        // ls(grid,0,0,n);
        return grid;
    }
}