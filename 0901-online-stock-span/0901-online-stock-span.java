class StockSpanner {
    Stack<Integer>stk=new Stack<>();
    List<Integer>lis=new ArrayList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        lis.add(price);
        int ind=lis.size()-1;
        while(!stk.isEmpty() && lis.get(stk.peek())<=price){
            stk.pop();
        }
        int res=stk.isEmpty()?ind+1:ind-stk.peek();
        stk.push(ind);
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */