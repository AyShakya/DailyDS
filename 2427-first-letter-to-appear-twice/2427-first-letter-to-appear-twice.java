class Solution {
    public char repeatedCharacter(String s) {
        int A[] = new int[26];
        for(int i=0;i<s.length();i++){
            int fr = s.charAt(i)-'a';
            A[fr]++;
            if(A[fr]==2){
                return s.charAt(i);
            }
        }
        return 'a';
    }
}