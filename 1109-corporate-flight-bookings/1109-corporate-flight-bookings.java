class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[]arr=new int[n+5];
        int len=bookings.length;
        for(int i=0;i<len;i++){
            arr[bookings[i][0]]+=bookings[i][2];
            arr[bookings[i][1]+1]-=bookings[i][2];
        }
        int[]res=new int[n];
        int curr_sum=0;
        for(int i=1;i<=n;i++){
            curr_sum+=arr[i];
            res[i-1]=curr_sum;
        }
        return res;
    }
}