class Solution {
    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> m = new HashMap<>();
        long mod = 1000000007;
        long sum = 0;
        long ans = 0;
        for(int[] p : points){
            m.put(p[1], m.getOrDefault(p[1],0)+1);
        }
        for(Integer p : m.values()){
            long edge = ((long)p*(p-1))/2;
            ans = (ans + edge*sum) % mod;
            sum = (sum + edge) % mod;
        }
        return (int)ans;
    }
}