class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> cal = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();
        for(int left=0,right=9;right<s.length();left++,right++){
            count.put(s.substring(left,right+1),count.getOrDefault(s.substring(left,right+1),0)+1);
        }
        for(Map.Entry<String, Integer> entry : count.entrySet()){
            if(entry.getValue()>1){
                cal.add(entry.getKey());
            }
        }
        return cal;
    }
}