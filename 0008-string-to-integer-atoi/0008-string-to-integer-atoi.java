class Solution {
    public int myAtoi(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        int n = s.length();
        long num = 0;
        int sign = 1;
        int i=0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && s.charAt(i)=='+'){
            i++;
        }
        else if(i<n && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        while(i<n && s.charAt(i)=='0'){
            i++;
        }
        while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            num=num*10 + (long)(s.charAt(i) - '0');
            if(sign == 1 && num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -num<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*num);
    }
}