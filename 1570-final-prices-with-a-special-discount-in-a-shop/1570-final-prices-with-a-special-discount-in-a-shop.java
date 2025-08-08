class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++) {
            // Check for all previous prices waiting for a discount
            while(!s.isEmpty() && prices[i] <= prices[s.peek()]) {
                int ind = s.pop();
                prices[ind] = prices[ind] - prices[i];
            }
            s.push(i);
        }
        
        return prices;
    }
}