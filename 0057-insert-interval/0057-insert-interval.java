class Solution {
    public int[][] insert(int[][] in, int[] n) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        int i=0;
        int n1 = in.length;
        while(i<n1 && in[i][1]<n[0]){
            l.add(new ArrayList<>());
            l.get(l.size()-1).add(in[i][0]);
            l.get(l.size()-1).add(in[i][1]);
            i++;
        }
        while(i<n1 && in[i][0]<=n[1]){
            n[0] = Math.min(n[0], in[i][0]);
            n[1] = Math.max(n[1], in[i][1]);
            i++;
        }
        l.add(new ArrayList<>());
        l.get(l.size()-1).add(n[0]);
        l.get(l.size()-1).add(n[1]);
        while(i<n1){
            l.add(new ArrayList<>());
            l.get(l.size()-1).add(in[i][0]);
            l.get(l.size()-1).add(in[i][1]);
            i++;
        }
        int [][]res = new int[l.size()][2];
        for(int k=0;k<l.size();k++){
            res[k][0] = l.get(k).get(0);
            res[k][1] = l.get(k).get(1);
        }
        return res;
    }
}