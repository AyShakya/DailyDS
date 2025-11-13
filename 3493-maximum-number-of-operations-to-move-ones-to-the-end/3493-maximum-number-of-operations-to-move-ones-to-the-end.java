class Solution {
    public int maxOperations(String s) {
        int ones = 0;
        int zeroes = 0;
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                zeroes++;
            }
            if(s.charAt(i)=='1' || (i==n-1)){
                if(ones>0 && zeroes>0){
                    ans += ones;
                }
                zeroes = 0;
                ones++;
            }
        }
        return ans;
    }
}