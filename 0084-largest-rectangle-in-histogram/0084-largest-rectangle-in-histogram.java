class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0){
            return 0;
        }
        Stack<Integer>stk=new Stack<>();
        // que.add(heights[0]);
        int ind=0;
        int len=heights.length;
        int res=0;
        while(ind<len){
        while(!stk.isEmpty() && heights[stk.peek()]>heights[ind]){
              int height=stk.pop();
              int width=(stk.isEmpty())?ind:ind-stk.peek()-1;
              res=Math.max(res,heights[height]*width);
            //   System.out.println(res);
        }
        stk.push(ind);
        ind++;
        }
        while(!stk.isEmpty()){
            int height=stk.pop();
            int width=(stk.isEmpty())?ind:len-stk.peek()-1;
            res=Math.max(res,heights[height]*width);
        }
        return res;
    }
}