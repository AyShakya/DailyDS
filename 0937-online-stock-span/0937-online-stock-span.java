class Pair {
    int first, second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class StockSpanner {
    Deque<Pair> dq = new ArrayDeque<>();
    int ind = -1;
    public StockSpanner() {
        ind = -1;
        dq.clear();
    }
    
    public int next(int price) {
        ind+=1;
        while(!dq.isEmpty() && dq.peek().first<=price){
            dq.pop();
        }
        int ans = ind - (dq.isEmpty()? -1 : dq.peek().second);
        dq.push(new Pair(price, ind));
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */