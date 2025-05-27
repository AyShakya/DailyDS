class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int A[] = new int[26];
        int B[] = new int[26];
        for(int i=0;i<word1.length();i++){
            A[word1.charAt(i)-'a']++;
            B[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<A.length;i++){
            if(Math.abs(A[i]-B[i])>3){
                return false;
            }
        }
        return true;
    }
}