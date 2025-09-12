class Solution {
    public boolean doesAliceWin(String s) {
        HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('A','E','I','O','U','a','e','i','o','u')
        );
        int n = s.length();
        int c=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(vowels.contains(ch)){
                c++;
            }
        }
        if(c==0){
            return false;
        }
        else{
            return true;
        }
    }
}