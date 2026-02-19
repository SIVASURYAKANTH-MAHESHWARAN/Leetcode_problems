class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer>stk=new Stack<>();
        int len=heights.length;
        int[]arr=new int[len];
        for(int i=len-1;i>=0;i--){
            int cnt=0;
            while(!stk.isEmpty() && heights[stk.peek()]<heights[i]){
                stk.pop();
                cnt++;
            }
            if(!stk.isEmpty()){
                cnt++;
            }
            arr[i]=cnt;
            stk.push(i);
        }
        return arr;
    }
}