class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        Map<Character, Integer> m = new HashMap<>();
        m.put('a', -1);
        m.put('b', -1);
        m.put('c', -1);
        int ans = 0;
        for(int i=0;i<n;i++){
            m.put(s.charAt(i), i);
            int l = Math.min(m.get('a'), Math.min(m.get('b'), m.get('c')));
            if(l!=-1){
                ans += (l-0+1);
            }
        }
        return ans;
    }
}