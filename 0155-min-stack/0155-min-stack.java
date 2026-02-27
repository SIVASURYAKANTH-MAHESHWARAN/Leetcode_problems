class MinStack {
    Stack<Integer>stk=new Stack<>();
    Stack<Integer>min_stk=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stk.push(val);
        if(!min_stk.isEmpty() && min_stk.peek()<val){
            min_stk.push(min_stk.peek());
        }
        else{
            min_stk.push(val);
        }
    }
    
    public void pop() {
        stk.pop();
        min_stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min_stk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */