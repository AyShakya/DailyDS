class Solution {
    public boolean checkOnesSegment(String s) {
        int a = 0;
        int i = 0;
        int n = s.length();
        while(i<n){
            int c=0;
            while(i<n && s.charAt(i)=='1'){
                i++;
                c++;
            }
            if(c>0) a++;
            while(i<n && s.charAt(i)=='0') i++;
        }
        if(a>1) return false;
        return true;
    }
}