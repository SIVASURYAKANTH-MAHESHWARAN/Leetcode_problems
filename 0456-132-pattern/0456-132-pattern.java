class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer>stk=new Stack<>();
        int len=nums.length;
        int third=Integer.MIN_VALUE;
        for(int i=len-1;i>=0;i--){
            if(nums[i]<third){
                return true;
            }
            while(!stk.isEmpty() && stk.peek()<nums[i]){
                third=stk.pop();
            }
            stk.push(nums[i]);
        }
        return false;
    }
}