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
                int d = a.get(i).get(j) + prev[j];
                int dg = a.get(i).get(j) + prev[j+1];
                cur[j] = Math.min(d, dg);
            }
            prev = cur;
        }
        return prev[0];
    }
}