class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int DAT[] = new int[n+1];
        DAT[0]=0;
        DAT[1]=1;
        for(int i=2;i<=n;i++){
            DAT[i]=DAT[i-1]+DAT[i-2];
        }
        return DAT[n];
    }
}