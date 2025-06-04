class Solution {
    public String answerString(String word, int f) {
        int n = word.length();
        if(f==1){
            return word;
        }
        int L = n-(f-1);
        String best="";
        for(int i=0;i<n;i++){
            int can = Math.min(L,n-i);
            if (best.compareTo(word.substring(i, i+can)) < 0) {
                best = word.substring(i, i+can);
            }
        }
        return best;
    }
}