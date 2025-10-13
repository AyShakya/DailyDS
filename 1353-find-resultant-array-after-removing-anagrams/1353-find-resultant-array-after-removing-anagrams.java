class Solution {
    public boolean Anagram(String s1, String s2){
        int[] c = new int[26];
        for(char ch : s1.toCharArray()){
            c[ch-'a']++;
        }
        for(char ch : s2.toCharArray()){
            c[ch-'a']--;
            if(c[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        Deque<String> s = new ArrayDeque<>();
        int n = words.length;
        s.push(words[0]);
        for(int i=1;i<n;i++){
            if(words[i].length() == s.peek().length()){
                if(Anagram(words[i], s.peek())){
                    continue;
                }
                else{
                    s.push(words[i]);
                }
            }
            else{
                s.push(words[i]);
            }
        }
        List<String> res = new ArrayList<>(s);
        Collections.reverse(res);
        return res;
    }
}