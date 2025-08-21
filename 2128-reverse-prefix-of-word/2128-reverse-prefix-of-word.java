class Solution {
    public String reversePrefix(String word, char ch) {
        int count = word.indexOf(ch);
        if(count == -1) return word;

        StringBuilder sb = new StringBuilder(word.substring(0,count+1));
        sb.reverse();
        sb.append(word.substring(count+1,word.length()));
        return sb.toString();
    }
}