class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> cal = new HashMap<>();
        for(int i : nums){
            cal.put(i, cal.getOrDefault(i,0)+1);
        }
        int maxlen=0;
        for(int key : cal.keySet()){
            if(cal.containsKey(key+1)){
                maxlen=Math.max(maxlen, (cal.get(key)+cal.get(key+1)));
            }
        }
        return maxlen;
    }
}