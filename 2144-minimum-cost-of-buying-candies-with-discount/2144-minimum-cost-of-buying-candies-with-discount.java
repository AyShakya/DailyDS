class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans = 0;
        int n = cost.length-1;
        while(n>=0){
            ans+=cost[n];
            if(n-1<0) break;
            else n--;
            ans+=cost[n];
            if(n-1<0) break;
            else n--;
            if(n-1<0) break;
            else n--;
        }
        return ans;
    }
}