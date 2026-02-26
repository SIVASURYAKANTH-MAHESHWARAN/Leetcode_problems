class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len=nums.length;
        int[]arr=new int[len-k+1];
        Deque<Integer>deck=new LinkedList<>();
        for(int i=0;i<len;i++){
            if(!deck.isEmpty() && deck.peekFirst()<=i-k){
                deck.pollFirst();
            }
            while(!deck.isEmpty() && nums[deck.peekLast()]<=nums[i]){
                deck.pollLast();
            }
            deck.offerLast(i);
            if(i>=k-1){
                arr[(i-k)+1]=nums[deck.peekFirst()];
            }
        }
        return arr;
    }
}