class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> cal1 = new HashMap<>();
        Map<String, Integer> cal2 = new HashMap<>();
        for(String s : words1){
            cal1.put(s,cal1.getOrDefault(s,0)+1);
        }
        for(String s : words2){
            cal2.put(s,cal2.getOrDefault(s,0)+1);
        }
        int count=0;
        for(Map.Entry<String,Integer> entry : cal1.entrySet()){
            if(entry.getValue()==1){
                if(cal2.containsKey(entry.getKey()) && cal2.get(entry.getKey())==1){
                    count++;
                }
            }
        }
        return count++;
    }
}