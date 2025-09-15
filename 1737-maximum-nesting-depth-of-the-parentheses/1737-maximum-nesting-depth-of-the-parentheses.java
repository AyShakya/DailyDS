class Solution {
    public int maxDepth(String s) {
        int maxD = 0, c=0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                c++;
            }
            else if(ch == ')'){
                maxD = Math.max(maxD, c);
                if(c!=0){
                    c--;
                }
            }
        }
        return maxD;
    }
}