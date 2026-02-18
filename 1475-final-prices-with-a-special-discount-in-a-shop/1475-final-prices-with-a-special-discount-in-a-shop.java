class Solution {
    public int[] finalPrices(int[] prices) {
        int len=prices.length;
        int[]arr=Arrays.copyOf(prices,len);
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<len;i++){
            while(!stk.isEmpty() && prices[stk.peek()]>=prices[i]){
                int ind=stk.pop();
                arr[ind]=arr[ind]-arr[i];
            }
            stk.push(i);
        }
        return arr;
    }
}