class Solution {
    public int lengthy(int n){
        int c = 0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c;
    }
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0){
            return -1;
        }
        Set<Integer> s = new HashSet<>();
        int rem = 1%k;
        int n = 1;
        while(true){
            if(rem == 0){
                return n;
            }
            if(!s.add(rem)) return -1;
            rem = (rem*10+1)%k;
            n++;
        }
    }
}