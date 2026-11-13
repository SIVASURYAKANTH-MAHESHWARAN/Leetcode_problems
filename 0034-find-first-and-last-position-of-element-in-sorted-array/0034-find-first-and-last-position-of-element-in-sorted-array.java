class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length-1;
        int start=-1;
        int end=-1;
        int low=0;
        int high=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                start=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                end=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{start,end};
    }
}