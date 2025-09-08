class Solution {
    public boolean findZero(int x){
        String s = String.valueOf(x);
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                return true;
            }
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int a = 0;
        for(int i=1;i<n;i++){
            if(!findZero(i) && !findZero(n-i)){
                a=i;
                break;
            }
        }
        return new int[]{a,n-a};
    }
}