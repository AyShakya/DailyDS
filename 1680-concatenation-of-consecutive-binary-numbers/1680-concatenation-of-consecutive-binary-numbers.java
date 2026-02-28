class Solution {
    public int concatenatedBinary(int n) {
        long sum = 0;
        int mod = 1_000_000_007;
        int p = 0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0) p++;
            sum = ((sum << p)+i)%mod;
        }
        return (int)sum;
    }
}