class Solution {
    public boolean digitCount(String num) {
        int A[] = new int[10];
        for(int i=0;i<num.length();i++){
            int digit = num.charAt(i) - '0';
            A[digit]++;
        }
        for(int i=0;i<num.length();i++){
            int digit = num.charAt(i) - '0';
            if(A[i]!=digit){
                return false;
            }
        }
        return true;
    }
}