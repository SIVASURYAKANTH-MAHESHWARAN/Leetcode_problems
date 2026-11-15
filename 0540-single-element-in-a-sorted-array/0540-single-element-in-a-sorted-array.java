class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        if(n==1){
            return arr[0];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid-1>=0 && arr[mid]!=arr[mid-1] && mid+1<=n-1 && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            else if(mid-1>=0 && arr[mid]==arr[mid-1]){
                int len=mid-low;
                if(len%2==0){
                    high=mid-2;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                int len=high-mid;
                if(len%2==0){
                    low=mid+2;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return arr[high];
    }
}