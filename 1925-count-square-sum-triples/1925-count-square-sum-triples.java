class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                int v = i*i + j*j;
                int c = (int)Math.sqrt(v);
                if(c*c==v && c<=n){
                    ans+=2;
                }
            }
        }
        return ans;
    }
}