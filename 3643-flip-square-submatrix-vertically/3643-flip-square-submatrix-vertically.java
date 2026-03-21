class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i0 = x, i1 = x+k-1; i0<i1; i0++, i1--){
            for(int j=y;j<y+k;j++){
                int t = grid[i0][j];
                grid[i0][j] = grid[i1][j];
                grid[i1][j] = t;
            }
        }
        return grid;
    }
}