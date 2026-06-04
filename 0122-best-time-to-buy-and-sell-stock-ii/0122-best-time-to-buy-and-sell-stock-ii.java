class Solution {
    int res=0;
    public int maxProfit(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                res+=(arr[i+1]-arr[i]);
            }
        }
        return res;
    }
}