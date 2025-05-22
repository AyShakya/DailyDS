class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                if(Character.isLetter(s.charAt(i))){
                    sb.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
                else{
                    sb.append(String.valueOf(s.charAt(i)));
                }
            }
        }
        int j=0,k=sb.length()-1;
        while(j<k){
            if(sb.charAt(j)!=sb.charAt(k)){
                return false;
            }
            j++;
            k--;
        }
        return true;
    }
}