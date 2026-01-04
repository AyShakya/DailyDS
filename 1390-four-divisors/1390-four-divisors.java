class Solution {
    private int four(int n){
        int sum = 0;
        int c = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int a1 = i;
                int a2 = n/i;
                c++;
                sum+=a1;
                if(a1!=a2){
                    c++;
                    sum+=a2;
                }
            }
            if(c>4) return 0;
        }
        return c==4?sum:0;
    }
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans += four(i);
        }
        return ans;
    }
}