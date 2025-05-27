class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> count1 = new HashMap<>();
        Map<Integer, Integer> count2 = new HashMap<>();
        Map<Integer, Integer> count3 = new HashMap<>();
        for(int i : nums1){
            count1.put(i,count1.getOrDefault(i,0)+1);
        }
        for(int i : nums2){
            count2.put(i,count2.getOrDefault(i,0)+1);
        }
        for(int i : nums3){
            count3.put(i,count3.getOrDefault(i,0)+1);
        }
        List<Integer> cal = new ArrayList<>();
        for(Integer i : count1.keySet()){
            if(count2.containsKey(i)){
                cal.add(i);
                count2.remove(i);
                
            }
            else if(count3.containsKey(i)){
                cal.add(i);
                count3.remove(i);
              
            }
        }
        for(Integer i : count2.keySet()){
            if(count3.containsKey(i)){
                cal.add(i);

            }
        }
        return cal;
        
    }
}