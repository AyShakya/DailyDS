class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Deque<String> dq = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        String small = s;
        visited.add(s);
        dq.offer(s);
        while(!dq.isEmpty()){
            String curr = dq.poll();
            if(curr.compareTo(small) < 0){
                small = curr;
            }
            char[] chars = curr.toCharArray();
            for(int i=1;i<chars.length; i+=2){
                chars[i] = (char)((chars[i]-'0'+a)%10 + '0');
            }
            String str = new String(chars);
            if(visited.add(str)){
                dq.offer(str);
            }

            String rotated = curr.substring(curr.length()-b) + curr.substring(0, curr.length()-b);
            if(visited.add(rotated)){
                dq.offer(rotated);
            }            
        }
        return small;
    }
}