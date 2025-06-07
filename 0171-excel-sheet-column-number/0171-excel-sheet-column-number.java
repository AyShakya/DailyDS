class Solution {
    public int titleToNumber(String c) {
        int num = 0;
        for(int i=0;i<c.length();i++){
            num=num*26 + (c.charAt(i)-'A'+1);
        }
        return num;
    }
}