class Solution {
    public int sumFourDivisors(int[] nums) {
        long ans = 0;
        for(int i : nums){
            int c = 0;
            int a1 = 0;
            int b1 = 0;
            int n = i/2;
            for(int j=2;j<=n;j++){
                if(i%j==0){
                    c++;
                    if(a1==0) a1=j;
                    else if(b1==0) b1=j;
                    else break;
                }
            }
            if(c==2) ans+=(long)(1+i+a1+b1);
        }
        return (int)ans;
    }
}