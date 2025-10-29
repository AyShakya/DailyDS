class Solution {
    public int smallestNumber(int n) {
        if((n & (n+1))==0){
            return n;
        }
        int k = Integer.toBinaryString(n+1).length();
        return (1 << k) - 1;
    }
}