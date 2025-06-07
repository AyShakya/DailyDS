class Solution {
    private StringBuilder convert(int c, StringBuilder sb){
        if(c==0) return sb;
        int r=(c-1)%26;
        sb.append((char)(r+'A'));
        convert((c-1)/26,sb);
        return sb;
    }
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        return convert(columnNumber, sb).reverse().toString();
    }
}