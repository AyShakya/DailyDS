class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> cal = new Stack<>();
        Stack<Integer> res = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        int i=0,n=s.length();
        while(i<n){
            Character ch = s.charAt(i);
            if(ch=='('){
                if(cal.isEmpty()){
                    res.push(i);
                }
                cal.push(ch);
            }
            else{
                cal.pop();
            }
            if(cal.isEmpty()){
                res.push(i);               
            }
            i++;
        }
        while(!res.isEmpty()){
            int j = res.pop();
            sb.deleteCharAt(j);
        }
        return sb.toString();
    }
}