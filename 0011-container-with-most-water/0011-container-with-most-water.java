class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        int ind1=0;
        int ind2=len-1;
        int max=0;
        while(ind1<ind2){
            if(height[ind1]<height[ind2]){
                int rem=height[ind1];
                max=Math.max(max,rem*(ind2-ind1));
                ind1++;
            }
            else{
                int rem=height[ind2];
                max=Math.max(max,rem*(ind2-ind1));
                ind2--;
            }
          
        }
        return max;
    }
}