class Solution {
    public int numSpecial(int[][] mat) {
        Map<Integer, Integer> r = new HashMap<>();
        Map<Integer, Integer> co = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int c = 0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) c++;
            }
            co.put(i, c);
        }
        for(int i=0;i<mat[0].length;i++){
            int c = 0;
            for(int j=0;j<mat.length;j++){
                if(mat[j][i]==1) c++;
            }
            r.put(i, c);
        }
        int ans = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    if(r.get(j)==1 && co.get(i)==1) ans++;
                }
            }
        }
        return ans;
    }
}