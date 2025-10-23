class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n-1;i++){
            int sum = ((s.charAt(i)-'0') + (s.charAt(i+1)-'0'))%10;
            sb.append(String.valueOf(sum));
        }
        if(sb.length()!=2){
            String str = new String(sb);
            return hasSameDigits(str);
        }
        return sb.charAt(0)==sb.charAt(1);
    }
}