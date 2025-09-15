class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int n = text.length();
        int i = 0, c = 0;
        while (i < n) {
            Boolean v = false;
            while (i < n && text.charAt(i) != ' ') {
                if (brokenLetters.contains(String.valueOf(text.charAt(i)))) {
                    v=true;
                }
                i++;
            }
            if(!v){
                c++;
            }
            i++;
        }
        return c;
    }
}