class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stk=new Stack<>();
        int len=heights.length;
        int max=0;
        for(int i=0;i<=len;i++){
            int curr=(i==len)?0:heights[i];
            while(!stk.isEmpty() && curr<heights[stk.peek()]){
                int height=heights[stk.pop()];
                int left=stk.isEmpty()?-1:stk.peek();
                int right=i;
                int width=right-left-1;
                max=Math.max(max,width*height);
            }
            stk.push(i);
        }
        return max;
    }
}