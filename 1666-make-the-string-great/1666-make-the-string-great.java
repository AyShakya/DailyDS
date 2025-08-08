class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
            }
            else{
                if(st.peek() != c){
                    if(Character.toUpperCase(st.peek()) == c || Character.toUpperCase(c) == st.peek()){
                        st.pop();
                    }
                    else{
                        st.push(c);
                    }
                }
                else{
                    st.push(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}