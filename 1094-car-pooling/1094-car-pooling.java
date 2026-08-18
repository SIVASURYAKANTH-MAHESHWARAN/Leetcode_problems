class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[]arr=new int[1005];
        int len=trips.length;
        for(int i=0;i<len;i++){
            arr[trips[i][1]]+=trips[i][0];
            arr[trips[i][2]]-=trips[i][0];
        }
        int curr_sum=0;
        for(int i=0;i<1005;i++){
            curr_sum+=arr[i];
            if(curr_sum>capacity){
                return false;
            }
        }
        return true;
    }
}