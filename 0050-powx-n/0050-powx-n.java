class Solution {
    private double cal(double x, int n){
        double y=0;
        if(n==0){
            return 1;
        }
        else{
            y=cal(x,n/2);
            if(n%2==0){
                return y*y;
            }
            else{
                return x*y*y;
            }
        }
    }
    public double myPow(double x, int n) {
        double ans = cal(x,n);
        if(n<0){
            return 1/ans;
        }
        return ans;
    }
}