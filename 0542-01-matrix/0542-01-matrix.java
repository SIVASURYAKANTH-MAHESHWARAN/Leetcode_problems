class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        boolean[][]vis=new boolean[row][col];
        Queue<int[]>que=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    vis[i][j]=false;
                }
                else{
                    que.add(new int[]{i,j});
                    vis[i][j]=true;
                }
            }
        }
        int[][]dr={{0,1},{0,-1},{1,0},{-1,0}};
        int level=1;
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
                int[]arr=que.poll();
                int r=arr[0];
                int c=arr[1];
                for(int[]dx:dr){
                    int nr=r+dx[0];
                    int nc=c+dx[1];
                    if(nr>=0 && nc>=0 && nr<mat.length && nc<mat[0].length && !vis[nr][nc] ){
                        que.add(new int[]{nr,nc});
                        mat[nr][nc]=level;
                        vis[nr][nc]=true;
                    }
                }
            }
            level++;
        }
        return mat;
    }
}