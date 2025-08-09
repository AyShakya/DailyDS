class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(candyType[i]);
        }
        return n/2 <= s.size() ? n/2 : s.size();
    }
}