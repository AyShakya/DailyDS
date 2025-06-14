class Pair {
    int first, second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Pair> cal = new ArrayList<>();
        for(int rowIndex = 0; rowIndex < mat.length; rowIndex++){
            int sum=0;
            for(int val : mat[rowIndex]){
                sum+=val;
            }
            cal.add(new Pair(sum, rowIndex));
        }
        cal.sort(Comparator.comparingInt((Pair p) -> p.first).thenComparingInt((Pair p) -> p.second));
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = cal.get(i).second;
        }
        return res;
    }
}