class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[]arr=Arrays.copyOf(temp,temp.length);
        int len=temp.length;
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<len;i++){
            while(!stk.isEmpty() && temp[i]>temp[stk.peek()]){
                int ind=stk.pop();
                arr[ind]=i-ind;
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            arr[stk.pop()]=0;
        }
        return arr;
    }
}