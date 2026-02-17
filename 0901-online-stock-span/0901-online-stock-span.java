class StockSpanner {
    class pair{
        int val;
        int cnt;
        pair(int val,int cnt){
            this.val=val;
            this.cnt=cnt;
        }
    }
    Stack<pair>stk=new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int cnt=0;
        while(!stk.isEmpty() && stk.peek().val<=price){
            // cnt++;
            pair p=stk.pop();
            cnt+=p.cnt;
        }
        pair p=new pair(price,cnt+1);
        stk.push(p);
        return cnt+1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */