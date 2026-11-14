class Solution {
    public int findMin(int[] arr) {
        int ans=Integer.MAX_VALUE;
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else{
                if(arr[mid]<ans){
                ans=arr[mid];
                }
                high=mid-1;
            }
            
        }
        return ans;
    }
}