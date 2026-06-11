class Solution {
    public int recurr(int[][]grid,int i,int j,int r,int c){
        int curr=grid[i][j];
        grid[i][j]=0;
        int up=Integer.MAX_VALUE;
        int down=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        int left=Integer.MAX_VALUE;
        if(i+1<r && grid[i+1][j]!=0){
            up=recurr(grid,i+1,j,r,c);
        }
        if(i-1>=0 && grid[i-1][j]!=0){
            down=recurr(grid,i-1,j,r,c);
        }
        if(j-1>=0 && grid[i][j-1]!=0){
            left=recurr(grid,i,j-1,r,c);
        }
        if(j+1<c && grid[i][j+1]!=0){
           right=recurr(grid,i,j+1,r,c);
        }
        up=(up==Integer.MAX_VALUE)?0:up;
        down=(down==Integer.MAX_VALUE)?0:down;
        right=(right==Integer.MAX_VALUE)?0:right;
        left=(left==Integer.MAX_VALUE)?0:left;
        return curr+right+left+up+down; 
    }
    public int findMaxFish(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]!=0){
                max=Math.max(recurr(grid,i,j,r,c),max);
                }
            }
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
}