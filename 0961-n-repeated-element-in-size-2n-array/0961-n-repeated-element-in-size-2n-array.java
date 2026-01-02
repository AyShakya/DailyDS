class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> s = new HashSet<>();
        for(int i : A){
            if(s.add(i)){
                continue;
            }
            else{
                return i;
            }
        }
        return -1;
    }
}