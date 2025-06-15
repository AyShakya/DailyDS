class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);
        int n1=9, n2=1;
        for(int i=0;i<s.length();i++){
            if(n1==9 && s.charAt(i)!='9'){
                n1=s.charAt(i) - '0';
            }
            if(n2==1 && s.charAt(i)!='1' && s.charAt(i)!='0'){
                n2=s.charAt(i) - '0';
            }
        }
        int c=1;
        if(s.charAt(0)=='1' && n2!=1){
            c=0;
        }
        int max=0,min=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'==n1){
                max=max*10 + 9;
            }
            else{
                max=max*10 + s.charAt(i)-'0';
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'==n2){
                min=min*10 + c;
            }
            else{
                min=min*10 + s.charAt(i)-'0';
            }
        }
        return max-min;
    }
}