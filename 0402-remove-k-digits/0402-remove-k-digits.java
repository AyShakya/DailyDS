class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();
        int n = num.length();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && k>0 && (st.peek()-'0')>(num.charAt(i)-'0')){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        String res = sb.reverse().toString();
        int i = 0;
        int o = sb.length();
        while(i<o && sb.charAt(i)=='0'){
            i++;
        }
        if(i==o) return "0";
        return res.substring(i,o);
    }
}