class Solution {
    private boolean Psquare(int num) {
        if(num==1) return true;
        long left = 0, right = num/2;
        while(left<=right){
            long mid = (left+right)/2;
            long sqr = mid*mid;
            if(sqr==num){
                return true;
            }
            else if(sqr<num){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
    public boolean judgeSquareSum(int c) {
        if(c==0 || c==1){
            return true;
        }
        for(int i=1;i<=Math.sqrt(c);i++){
            int k = c-i*i;
            if(Psquare(k)){
                return true;
            }
        }
        return false;
    }
}