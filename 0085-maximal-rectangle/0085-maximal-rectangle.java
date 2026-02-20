class Solution {
    public int func(int[]arr){
        int len=arr.length;
        Stack<Integer>stk=new Stack<>();
        int max=0;
        for(int i=0;i<=len;i++){
            int val=(i==len)?-1:arr[i];
            while(!stk.isEmpty() && arr[stk.peek()]>val){
                int ind=stk.pop();
                int height=arr[ind];
                int width=stk.isEmpty()?i:i-stk.peek()-1;
                max=Math.max(max,height*width);
                
            }
            stk.push(i);
            
        }
        return max;
    }
    public int maximalRectangle(char[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int[][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int curr=mat[i][j]-'0';
                if(i==0){
                    arr[i][j]=curr;
                }
                else{
                    if(curr==0){
                        arr[i][j]=0;
                    }
                    else{
                    arr[i][j]=curr+arr[i-1][j];
                    }
                }
            }
        }
        int max=0;
        for(int i=0;i<row;i++){
            int res=func(arr[i]);
            
            max=Math.max(max,res);
        }
        return max;
    }
}