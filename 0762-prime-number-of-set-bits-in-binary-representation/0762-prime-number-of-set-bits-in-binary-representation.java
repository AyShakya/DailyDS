class Solution {
    public int set(int n){
        String b = Integer.toBinaryString(n);
        int c = 0;
        for(char ch : b.toCharArray()){
            if(ch=='1') c++;
        }
        return c;
    }
    public boolean prime(int n){
        int a = set(n);
        if(a==1) return false;
        if(a==2 || a==3 || a==5) return true;
        if(a%2==0 || a%3==0 || a%5==0) return false;
        for(int i=7;i*i<a;i=i+2){
            if(a%i==0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for(int i=left;i<=right;i++){
            if(prime(i)){
                c++;
            }
        }
        return c;
    }
}