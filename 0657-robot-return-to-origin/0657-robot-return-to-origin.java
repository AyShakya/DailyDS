class Solution {
    public boolean judgeCircle(String moves) {
        int a=0, b=0;
        for(char ch : moves.toCharArray()){
            if(ch=='U'){
                a++;
            }
            else if(ch=='D'){
                a--;
            }
            else if(ch=='L'){
                b++;
            }
            else b--;
        }
        if(a==0 && b==0) return true;
        return false;
    }
}