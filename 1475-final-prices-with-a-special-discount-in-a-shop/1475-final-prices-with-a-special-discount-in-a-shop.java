class Solution {
    public int[] finalPrices(int[] prices) {
        int len=prices.length;
        int[]arr=new int[len];
        Stack<Integer>stk=new Stack<>();
        int i=0;
        
        Map<Integer,Integer>map=new HashMap<>();
        while(i<len){
            while(!stk.isEmpty() && prices[stk.peek()]>=prices[i]){
                int ind=stk.pop();
                map.put(ind,prices[ind]-prices[i]);
            }
            stk.push(i);
            i++;
        }
        while(!stk.isEmpty()){
            int ind=stk.pop();
            map.put(ind,prices[ind]);
        }
        i=0;
        for(i=0;i<len;i++){
            arr[i]=map.get(i);
        }
        return arr;
    }
}