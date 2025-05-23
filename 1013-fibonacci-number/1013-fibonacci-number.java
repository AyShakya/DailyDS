class Solution {
    private int fibo(int n){
        int DAT[] = new int[40];
        if(n<2){
            return n;
        }
        else{
            if(DAT[n]==0){
                DAT[n]=fibo(n-1)+fibo(n-2);
                return DAT[n];
            }
        }
        return 0;
    }
    public int fib(int n) {
        return fibo(n);
    }
}