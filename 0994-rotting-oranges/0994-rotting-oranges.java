class Solution {
    public int orangesRotting(int[][] grid) {
        int r1=grid.length;
        int c1=grid[0].length;
        Queue<int[]>que=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                if(grid[i][j]==2){
                    que.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[][]dir={{0,1},{0,-1},{1,0},{-1,0}};
        int cnt=0;
        while(!que.isEmpty()){
            int size=que.size();           
            for(int i=0;i<size;i++){
                 int[]arr=que.poll();
                 int r=arr[0];
                 int c=arr[1];
                for(int[]dx:dir){
                    int nr=r+dx[0];
                    int nc=c+dx[1];
                    if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                        que.add(new int[]{nr,nc});
                        grid[nr][nc]=2;
                        fresh--;
                    }
                }
            }
            cnt++;
        }
        return fresh>0?-1:Math.max(cnt-1,0);
    }
}