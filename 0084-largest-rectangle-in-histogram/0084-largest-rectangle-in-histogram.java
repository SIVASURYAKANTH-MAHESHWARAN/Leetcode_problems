class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer>stk=new Stack<>();
        int len=arr.length;
        int max=Integer.MIN_VALUE;
        // stk.push(0);
        for(int i=0;i<len;i++){
            // int cnt=1;
    
            while(!stk.isEmpty() && arr[stk.peek()]>arr[i]){
                // max=Math.max(max,stk.pop()*cnt);
                // stk.push(arr[i]*)

                int curr=stk.pop();
    
                int width=(stk.isEmpty())?i*arr[curr]:(i-stk.peek()-1)*arr[curr];
                max=Math.max(max,width);
            }
    
                stk.push(i);
            
         
        } 

        // while(!stk.isEmpty()){

        // }
        // int cnt=1;
        int ind=len;
        while(!stk.isEmpty()){
            // max=Math.max(max,stk.pop()*cnt);
            // cnt++;

            int curr=stk.pop();
            int width=(stk.isEmpty())?ind*arr[curr]:(ind-stk.peek()-1)*arr[curr];
            max=Math.max(max,width);
        }
        return max;
    }
}