class Solution {
    private int adding(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            sum+=r;
        }
        return sum;
    }
    public int addDigits(int num) {
        while(num>=10){    
            num=adding(num);
        }
        return num;
    }
}