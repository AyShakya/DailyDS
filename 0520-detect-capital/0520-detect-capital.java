class Solution {
    public boolean detectCapitalUse(String word) {
        Boolean lc = false;
        int count = 0;
        if(word.charAt(0) >= 'a'){
            lc = true;
        }
        else{
            count++;
        }
        for(int i=1;i<word.length();i++){
            if(word.charAt(i) <'a'){
                lc = false;
                count++;
            }
        }
        if(count == word.length() || lc || (count==1 && word.charAt(0)<'a')){
            return true;
        }
        return false;
    }
}