class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>stk=new Stack<>();
        Map<Integer,Integer>map=new HashMap<>();
        int len=nums.length;
        int[]arr=new int[len];
        for(int i=0;i<len;i++){
            while(!stk.isEmpty() && nums[stk.peek()]<nums[i]){
                map.put(stk.pop(),nums[i]);
            }
            stk.push(i);
        }
        for(int i=0;i<len;i++){
            while(nums[stk.peek()]<nums[i]){
                map.put(stk.pop(),nums[i]);
            }
        }
        while(!stk.isEmpty()){
            map.put(stk.pop(),-1);
        }
        for(int i=0;i<len;i++){
            arr[i]=map.get(i);
        }
        return arr;
    }
}