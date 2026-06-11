class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;
        int[]dp=new int[n];
        for(int i=0;i<n-1;i++){
            dp[edges[i][0]-1]++;
            dp[edges[i][1]-1]++;
        }
        for(int i=0;i<n;i++){
            if(dp[i]==n-1){
                return i+1;
            }
        }
        return -1;
    }
}