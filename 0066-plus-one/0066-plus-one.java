class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            digits[i]++;
            if(digits[i]<10){
                return digits;
            }
            digits[i]=0;
        }
        int ans[] = new int[n+1];
        ans[0]=1;
        int k=1;
        for(int j : digits){
            ans[k]=j;
            k++;
        }
        return ans;
    }
}