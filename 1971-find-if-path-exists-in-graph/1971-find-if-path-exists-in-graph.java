class Solution {
    public boolean recurr(boolean[]vis,List<List<Integer>>lis,int ind ,int d){
        if(ind==d){
            return true;
        }
        vis[ind]=true;
        
        for(int i:lis.get(ind)){
            if(!vis[i]){
                if(recurr(vis,lis,i,d)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>lis=new ArrayList<>();
        for(int i=0;i<n;i++){
            lis.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
          
                int s=edges[i][0];
                int d=edges[i][1];
                lis.get(s).add(d);
                lis.get(d).add(s);
           
        }
        boolean[]vis=new boolean[n];
        return recurr(vis,lis,source,destination);
    }
}