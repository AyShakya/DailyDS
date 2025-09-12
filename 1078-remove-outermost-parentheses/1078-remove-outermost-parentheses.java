class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(depth>0) sb.append(ch);
                depth++;
            }
            else{
                depth--;
                if(depth>0) sb.append(ch);
            }
        }
        return sb.toString();
    }
}