class MinStack {

    /** initialize your data structure here. */
    
    private Stack<Integer> stack;
    private int min;
    
    public MinStack() {
        stack = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x < min)
            min = x;
        
        stack.push(x);
        stack.push(min);
    }
    
    public void pop() {
        if(stack.empty())
            return;
        stack.pop();
        stack.pop();
        
        min = stack.empty()? Integer.MAX_VALUE : stack.peek();
    }
    
    public int top() {
        int temp = stack.pop();
        int top = stack.peek();
        stack.push(temp);
        return top;
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
