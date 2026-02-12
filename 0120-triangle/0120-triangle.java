class Solution {
    public int minimumTotal(List<List<Integer>> a) {
        int n = a.size();
        int prev[] = new int[n];
        for(int j=0;j<n;j++){
            prev[j] = a.get(n-1).get(j);
        }
        for(int i=n-2;i>=0;i--){
            int cur[] = new int[n];
            for(int j=i;j>=0;j--){
                int d = prev[j];
                int dg = prev[j+1];
                cur[j] = a.get(i).get(j) + Math.min(d, dg);
            }
            prev = cur;
        }
        return prev[0];
    }
}