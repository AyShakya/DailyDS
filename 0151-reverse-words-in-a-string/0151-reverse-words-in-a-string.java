class Solution {
    public String reverseWords(String s) {
        if(s==null || s.isEmpty()){
            return "";
        }
        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
}