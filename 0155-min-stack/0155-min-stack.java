class MinStack {

    Stack<Long> s = new Stack<>();
    long min;
    public MinStack() {
        this.min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        long longVal = (long)val; 
        if (s.isEmpty()) {
            s.push(longVal);
            min = longVal;
        } else {
            if (longVal >= min) {
                s.push(longVal);
            } else {
                
                long marker = 2 * longVal - min;
                s.push(marker); 
                min = longVal; 
            }
        }
    }
    
    public void pop() {
        long poppedVal = s.pop();
       
        if (poppedVal < min) {
           
            min = 2 * min - poppedVal;
        }
    }
    
    public int top() {
        long topVal = s.peek();
        if (topVal < min) {
            return (int)min;
        } else {
            return (int)topVal;
        }
    }
    
    public int getMin() {
       return (int)min;
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