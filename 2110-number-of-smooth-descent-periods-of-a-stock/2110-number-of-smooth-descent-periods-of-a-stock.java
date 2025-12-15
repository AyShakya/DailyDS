class Solution {
    public long getDescentPeriods(int[] p) {
        int prev = 1;
        long res = 1;
        int n = p.length;
        for(int i=1;i<n;i++){
            if(p[i]==p[i-1]-1){
                ++prev;
            }
            else{
                prev = 1;
            }
            res+=prev;
        }
        return res;
    }
}