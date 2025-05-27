class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> cal = new HashMap<>();
        for(int i=0;i<s.length();i++){
            cal.put(s.charAt(i),cal.getOrDefault(s.charAt(i),0)+1);
        }
        int val = cal.get(s.charAt(0));
        for(Integer entry : cal.values()){
            if(entry!=val){
                return false;
            }
        }
        return true;
    }
}