class Solution {
    public int findMinArrowShots(int[][] points) {
        int cnt=1;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int n=points.length;
        int p=points[0][1];
        // if(n>=2 && points[1][0]>p){
        //     cnt++;
        // }
        for(int i=1;i<n;i++){
            if(points[i][0]>p){
                cnt++;
                p=points[i][1];
            }      
        }
        // if(p!=points[n-1][1]){
        //     cnt++;
        // }
        return cnt;
    }
}