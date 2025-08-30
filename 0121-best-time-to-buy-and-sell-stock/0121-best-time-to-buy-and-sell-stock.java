class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0, curr = prices[0];
        int n = prices.length;
        for(int i=1;i<n;i++){
            if(curr>=prices[i]){
                curr = prices[i];
            }
            else{
                maxi = Math.max(maxi, prices[i]-curr);
            }
        }
        return maxi;
    }
}