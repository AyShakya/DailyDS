class Solution {
    public int maxDepth(String s) {
        int maxD = 0, c=0;
        Deque<Character> dq = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                dq.push(ch);
                c++;
            }
            else if(ch == ')'){
                dq.pop();
                maxD = Math.max(maxD, c);
                if(c!=0){
                    c--;
                }
            }
        }
        return maxD;
    }
}