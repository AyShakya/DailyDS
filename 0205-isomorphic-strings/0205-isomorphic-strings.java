class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> count = new HashMap<>();
        count.put(s.charAt(0),t.charAt(0));
        for(int i=1;i<s.length();i++){
            if(count.containsKey(s.charAt(i))){
                Character ch = count.get(s.charAt(i));
                if(ch!=t.charAt(i)){
                    return false;
                }
                continue;
            }
            else if(count.containsValue(t.charAt(i))){
                return false;
            }
            count.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}