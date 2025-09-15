class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a,b) -> {
            int cmp = Integer.compare(b.getValue(), a.getValue()); 
            if (cmp != 0) return cmp;
            return Character.compare(a.getKey(), b.getKey()); 
        });
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> e : list){
            for(int j=0;j<e.getValue();j++){
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
}