class Solution {
    public int minOperations(String s) {
        int ans1=0;
        int ans2=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(s.charAt(i)=='1') continue;
                else ans1++;
            }
            else{
                if(s.charAt(i)=='0') continue;
                else ans1++;
            }
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(s.charAt(i)=='0') continue;
                else ans2++;
            }
            else{
                if(s.charAt(i)=='1') continue;
                else ans2++;
            }
        }
        return Math.min(ans1, ans2);
    }
}