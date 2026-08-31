class Solution {
    public int func(Queue<int[]>que,int[]tar,boolean[][]vis){
    //    int cnt=1;
        int[][]dr={{-1,-1},{-1,1},{1,1},{1,-1}};
        while(!que.isEmpty()){
            int[]arr=que.poll();
            int x=arr[0];
            int y=arr[1];
            int cnt1=arr[2]+1;
            vis[x][y]=true;
            if(x==tar[1] && y==tar[0]){
                return cnt1;
            }
            int nr=x+1;
            int nc=y+1;
            while(nr>=1 && nc>=1 && nr<=8 && nc<=8 && !vis[nr][nc]){
                if(nr==tar[0] && nc==tar[1]){
                    return cnt1;
                }
                que.add(new int[]{nr,nc,cnt1});
                // System.out.print(nr+" "+nc);
                nr++;
                nc++;
            }

            // if(x+1>=1 && y+1>=1 && x+1<=8 && y+1<=8 && !vis[x+1][y+1]){
            //  que.add(new int[]{x+1,y+1,cnt1+1});
            // }
            nr=x-1;
            nc=y+1;
            while(nr>=1 && nc>=1 && nr<=8 && nc<=8 && !vis[nr][nc]){
                if(nr==tar[0] && nc==tar[1]){
                    return cnt1;
                }
               que.add(new int[]{nr,nc,cnt1});
                nr--;
                nc++;
            }
            //  if(x-1>=1 && y+1>=1 && x-1<=8 && y+1<=8 && !vis[x-1][y+1]){
            // que.add(new int[]{x-1,y+1,cnt1+1});
            //  }
            nr=x-1;
            nc=y-1;
            while(nr>=1 && nc>=1 && nr<=8 && nc<=8 && !vis[nr][nc]){
                if(nr==tar[0] && nc==tar[1]){
                    return cnt1;
                }
                que.add(new int[]{nr,nc,cnt1});
                nr--;
                nc--;
            }
            //  if(x-1>=1 && y-1>=1 && x-1<=8 && y-1<=8 && !vis[x-1][y-1]){
            
            //  }
            nr=x+1;
            nc=y-1;
            while(nr>=1 && nc>=1 && nr<=8 && nc<=8 && !vis[nr][nc]){
                if(nr==tar[0] && nc==tar[1]){
                    return cnt1;
                }
                que.add(new int[]{nr,nc,cnt1});
                nr++;
                nc--;
            }
            //  if(x+1>=1 && y-1>=1 && x+1<=8 && y-1<=8 && !vis[x+1][y-1]){
            // que.add(new int[]{x+1,y-1,cnt1+1});
            //  }
            // cnt++;
            // for(int[]dx:dr){
            //     int nr1=dx[0]+x;
            //     int nc1=dx[1]+y;
            //     if( nr1>=1 && nc1>=1 && nr1<=8 && nc1<=8 && !vis[nr1][nc1]  ){
            //         if(dx[0]==1 && dx[1]==1||dx[0]==-1 && dx[1]==-1||dx[0]==-1 && dx[1]==1){
            //             que.add(new int[]{nr1,nc1,cnt});
            //         }
            //         else{
            //         que.add(new int[]{nr1,nc1,cnt+1});
            //         }
            //     }
            // }
        }
        
        return -1;
    }
    public int minBishopMoves(int[] source, int[] target) {
        boolean[][]vis=new boolean[9][9];
        Queue<int[]>que=new LinkedList<>();
        int[]arr=new int[3];
        arr[0]=source[0];
        arr[1]=source[1];
        arr[2]=0;
        que.add(arr);
        vis[source[0]][source[1]]=true;
        // for(int i=1;i<=8;i++){
        //     for(int j=1;j<=8;j++){
        //         System.out.print(vis[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        return func(que,target,vis);
    }
}