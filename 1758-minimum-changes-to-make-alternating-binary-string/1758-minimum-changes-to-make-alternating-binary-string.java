class Solution {
    public int minOperations(String s) {
        int ans1=0;
        int ans2=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(s.charAt(i)=='0') ans1++;
            }
            else{
                if(s.charAt(i)=='1') ans1++;
            }
            if(i%2==0){
                if(s.charAt(i)=='1') ans2++;
            }
            else{
                if(s.charAt(i)=='0') ans2++;
            }
        }
        return Math.min(ans1, ans2);
    }
}