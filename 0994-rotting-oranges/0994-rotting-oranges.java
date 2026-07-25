// class Solution {

//     public int bfs(Queue<int[]>que,boolean[][]vis,int[][]grid){
//         // Queue<int[]>que=new LinkedList<>();
//         // vis[i][j]=true;
//         // que.add(new int[]{i,j});
//         int cnt=0;
//         while(!que.isEmpty()){
//             cnt=que.size();
//             boolean rooted=false;
//             for(int i=0;i<cnt;i++){
//             int[]arr=que.poll();
//             int r=arr[0];
//             int c=arr[1];
//             grid[r][c]=2;
//             // vis[r][c]=true;
            
//                 if(c+1<grid[0].length && grid[r][c+1]==1 && !vis[r][c+1]){
//                  System.out.println(r+" "+(c+1));
//                 que.add(new int[]{r,c+1});
//                 vis[r][c+1]=true;
//             }
//             if(r+1<grid.length && grid[r+1][c]==1 && !vis[r+1][c]){
//                 System.out.println(r+1+" "+c+" ");
//                 que.add(new int[]{r+1,c});
//                 vis[r+1][c]=true;
//             }

//             if(c-1>=0 && grid[r][c-1]==1 && !vis[r][c-1]){
//                 System.out.println(r+1+" "+(c-1)+" ");
//                 que.add(new int[]{r,c-1});
//                 vis[r][c-1]=true;
//             }
//             if(r-1>=0 && grid[r-1][c]==1 && !vis[r-1][c]){
//                 que.add(new int[]{r-1,c});
//                 vis[r-1][c]=true;
//             }
//         }
//         }
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==1){
//                     return -1;
//                 }
//             }
//         }
//         return cnt;
//     }
//     public int orangesRotting(int[][] grid) {
//         Queue<int[]>que=new LinkedList<>();
//         int r=grid.length;
//         int c=grid[0].length;
//    boolean[][]vis=new boolean[r][c];
// int[][]arr=new int[r][c];
//         int cnt=0;
//         for(int i=0;i<r;i++){   
//             for(int j=0;j<c;j++){
             
//                 if(!vis[i][j] && grid[i][j]==2){
//                     que.add(new int[]{i,j});
//                     // int num=bfs(i,j,vis,arr);
//                     // System.out.print(num);
//                     // cnt++;
//                 }
            
  
//             }
//         }
//         return bfs(que,vis,grid);
//         // for(int i=0;i<r;i++){
//         //     for(int j=0;j<c;j++){
//         //         if()
//         //     }
//         // }
//         // return cnt;
//     }
// }




class Solution {

    public int bfs(Queue<int[]>que,boolean[][]vis,int[][]grid){
        // Queue<int[]>que=new LinkedList<>();
        // vis[i][j]=true;
        // que.add(new int[]{i,j});
        int cnt=0;
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
            int[]arr=que.poll();
            int r=arr[0];
            int c=arr[1];
            grid[r][c]=2;
       
          
                if(c+1<grid[0].length && grid[r][c+1]==1 && !vis[r][c+1]){
             
                que.add(new int[]{r,c+1});
                vis[r][c+1]=true;
            }
            if(r+1<grid.length && grid[r+1][c]==1 && !vis[r+1][c]){
               
                que.add(new int[]{r+1,c});
                vis[r+1][c]=true;
            }

            if(c-1>=0 && grid[r][c-1]==1 && !vis[r][c-1]){
            
                que.add(new int[]{r,c-1});
                vis[r][c-1]=true;
            }
            if(r-1>=0 && grid[r-1][c]==1 && !vis[r-1][c]){
                que.add(new int[]{r-1,c});
                vis[r-1][c]=true;
            }
            
            }
            cnt++;

        }
       
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return Math.max(0,cnt-1);
    }
    public int orangesRotting(int[][] grid) {
        Queue<int[]>que=new LinkedList<>();
        int r=grid.length;
        int c=grid[0].length;
   boolean[][]vis=new boolean[r][c];
int[][]arr=new int[r][c];
        int cnt=0;
        for(int i=0;i<r;i++){   
            for(int j=0;j<c;j++){
             
                if(!vis[i][j] && grid[i][j]==2){
                    que.add(new int[]{i,j});
                    // int num=bfs(i,j,vis,arr);
                    // System.out.print(num);
                    // cnt++;
                }
            
  
            }
        }
        return bfs(que,vis,grid);
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         if()
        //     }
        // }
        // return cnt;
    }
}