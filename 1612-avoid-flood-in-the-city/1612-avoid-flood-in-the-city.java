class Solution {
    public int[] avoidFlood(int[] rains) {
        Map<Integer, Integer> ind = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();
        int n = rains.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            if(rains[i]!=0){
                ans[i]=-1;
                if(ind.containsKey(rains[i])){
                    Integer dry = dryDays.higher(ind.get(rains[i]));
                    if (dry == null)
                        return new int[]{};
                    ans[dry] = rains[i];
                    dryDays.remove(dry);
                }
                ind.put(rains[i],i);
            }
            else{
                dryDays.add(i);
                ans[i] = 1;
            }
        }
        return ans;
    }
}