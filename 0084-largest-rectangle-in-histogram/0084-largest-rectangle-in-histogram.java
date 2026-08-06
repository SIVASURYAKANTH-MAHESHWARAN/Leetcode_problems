class Solution {
    public int largestRectangleArea(int[] heights) {
        // int[]heights=new int[arr.length];
        // int ind=0;
        // int i1=0;
        // while(i1<arr.length){
        //     if(arr[i1]!=0){
        //         heights[ind]=arr[i1];
        //         ind++;
        //     }
        //     i1++;
        // }
        Stack<Integer>stk=new Stack<>();
        int ind=0;
        int len=heights.length-1;
        int ans=Integer.MIN_VALUE;
        while(ind<=len){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[ind]){
                int i=stk.pop();
                int height=heights[i];
                int width=(!stk.isEmpty())?ind-stk.peek()-1:ind;
                System.out.println(height*width);
                ans=Math.max(ans,height*width);
            }
            
            stk.push(ind);
            ind++;
        }
        len=heights.length;
        while(!stk.isEmpty()){
            int height=stk.pop();
            // if(stk.isEmpty()){
            //     ans=Math.max(ans,heights[height]*len);
            // }
            // else{
            //     ans=Math.max(ans,(len-height)*heights[height]);
            // }
            // int width=(!stk.isEmpty())?len-stk.peek()+1:len;
            // System.out.println(height);
            if(stk.isEmpty()){
                ans=Math.max(ans,len*heights[height]);
            }
            else{
            ans=Math.max(ans,heights[height]*(len-stk.peek()-1));
            }
        }
        return ans;
    }
}