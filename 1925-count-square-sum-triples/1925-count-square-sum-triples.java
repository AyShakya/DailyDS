class Solution {
    public boolean triple(int i, int j, int n){
        int x = i*i + j*j;
        double y = Math.sqrt(x);
        int z = (int)y;
        double k = y-(double)z;
        if(k==0 && z<=n) return true;
        return false;
    }
    public int countTriples(int n) {
        int ans = 0;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(triple(i,j,n)) ans+=2;
            }
        }
        return ans;
    }
}