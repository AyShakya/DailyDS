class Solution {
    public String decodeString(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ']') {
                st.push(s.charAt(i));
            } else {
                StringBuilder sb = new StringBuilder();
                while (!st.isEmpty() && st.peek() != '[') {
                    sb.append(st.pop());
                }
                sb = sb.reverse();
                st.pop();
                int base = 1, num = 0;
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num = num + (st.pop() - '0') * base;
                    base *= 10;
                }
                for (int p = 0; p < num; p++) {
                    for (int j = 0; j < sb.length(); j++) {
                        st.push(sb.charAt(j));
                    }
                }
            }
        }
        StringBuilder sbn = new StringBuilder();
        while (!st.isEmpty()) {
            sbn.append(st.pop());
        }
        return sbn.reverse().toString();
    }
}