class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int[]arr=new int[len1];
        for(int i=0;i<len1;i++){
            int num=nums1[i];
            int max=num;
            for(int j=len2-1;j>=0;j--){
                if(nums2[j]==num){
                    if(nums2[j]==max){
                        arr[i]=-1;
                    }
                    else{
                        arr[i]=max;
                    }
                }
                if(nums1[i]<nums2[j]){
                    max=nums2[j];
                }
                
            }
        }
        return arr;
    }
}