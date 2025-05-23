class Solution {
    public int fib(int n) {
        int DAT[] = new int[40];
        if(n<2){
            return n;
        }
        else{
            if(DAT[n]==0){
                DAT[n]=fib(n-1)+fib(n-2);
                return DAT[n];
            }
        }
        return 0;
    }
}