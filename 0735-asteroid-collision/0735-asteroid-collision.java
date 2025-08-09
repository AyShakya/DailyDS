class Solution {
    public int[] asteroidCollision(int[] s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length;i++){
            if(st.isEmpty()){
                st.push(s[i]);
            }
            else if(st.peek()<0){
                st.push(s[i]);
            }
            else if(s[i]>0){
                st.push(s[i]);
            }
            else{
                Boolean val = true;
                while(!st.isEmpty() && st.peek()>0){
                    if(Math.abs(s[i]) > st.peek()){
                        st.pop();
                    }
                    else if(Math.abs(s[i]) == st.peek()){
                        val = false;
                        st.pop();
                        break;
                    }
                    else{
                        val = false;
                        break;
                    }
                }
                if(val){
                    st.push(s[i]);
                }
            }
        }
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}