class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->Integer.compare(a[0]-a[1],b[0]-b[1]));
        int n=costs.length;
        // for(int i=0;i<n;i++){
        //     System.out.println(costs[i][0]+" "+costs[i][1]);
        // }
        int ans=0;
        
        for(int i=0;i<n;i++){
            if(i<n/2){
                ans+=costs[i][0];
            }
            else{
                ans+=costs[i][1];
            }
        }
        return ans;
    }
}