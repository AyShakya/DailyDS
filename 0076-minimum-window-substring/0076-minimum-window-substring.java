class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int comp = t.length();
        int ans = Integer.MAX_VALUE;
        int SInd = -1;
        int c = 0;
        int l = 0;
        Map<Character, Integer> m = new HashMap<>();
        for(char ch : t.toCharArray()) m.put(ch, m.getOrDefault(ch, 0)+1);
        for(int r=0;r<n;r++){
            char ch = s.charAt(r);
            if(m.containsKey(ch)){
                if(m.get(ch) > 0) c++;
                m.put(ch, m.get(ch) - 1);
            }
            while(l<n && c==comp){
                if(r-l+1 < ans){
                    ans = r-l+1;
                    SInd = l;
                }
                char ch1 = s.charAt(l);
                if(m.containsKey(ch1)){
                    m.put(ch1, m.getOrDefault(ch1, 0)+1);
                    if(m.get(ch1)>0){
                        c--;
                    }
                }
                l++;
            }
        }
        return ans == Integer.MAX_VALUE?"": s.substring(SInd, SInd+ans);
    }
}