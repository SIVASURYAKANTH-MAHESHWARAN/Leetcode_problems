class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len=nums1.length;
        int[]arr=new int[len];
        Map<Integer,Integer>map=new HashMap<>();
        int ind=0;
        int len1=nums2.length;
        Stack<Integer>stk=new Stack<>();
        while(ind<len1){
            while(!stk.isEmpty() && stk.peek()<nums2[ind]){
                map.put(stk.pop(),nums2[ind]);
            }
            stk.push(nums2[ind]);
            ind++;
        }
        while(!stk.isEmpty()){
            map.put(stk.pop(),-1);
        }
        ind=0;
        for(int i=0;i<len;i++){
            arr[ind++]=map.get(nums1[i]);
        }
        return arr;
    }
}