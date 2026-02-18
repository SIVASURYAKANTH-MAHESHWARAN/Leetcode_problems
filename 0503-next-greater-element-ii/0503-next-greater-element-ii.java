class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len=nums.length;
        int[]arr=new int[len];
        Stack<Integer>stk=new Stack<>();
        for(int i=2*len-1;i>=0;i--){
            int ind=i%len;
            System.out.println(ind);
            while(!stk.isEmpty() && stk.peek()<=nums[ind]){
                stk.pop();
            }
            if(i<len){
                arr[i]=(stk.isEmpty())?-1:stk.peek();
            }
            stk.push(nums[ind]);
        }
        return arr;
    }
}