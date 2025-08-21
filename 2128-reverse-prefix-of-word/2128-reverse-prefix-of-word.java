class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        StringBuilder n = new StringBuilder();
        Boolean v = false;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(!v){
                sb.append(c);
            }
            else{
                n.append(c);
            }
            if(c == ch){
                v = true;
            }
        }
        if(v){
            sb.reverse();
            sb.append(n);
        }
        return sb.toString();
    }
}