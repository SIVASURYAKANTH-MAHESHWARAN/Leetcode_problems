class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length;
        long cnt=0;
        for(int i=0;i<n;i++){
            int end=intervals[i][1];
            int left=i+1;
            int right=n;
            while(left<right){
                int mid=(left+right)/2;
                if(intervals[mid][0]>end){
                    right=mid;
                }
                else{
                    left=mid+1;
                }
            }
            // System.out.println(left+" "+i);
            cnt+=left-i-1;
        }
        return cnt;
    }
}