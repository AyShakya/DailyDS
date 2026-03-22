class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int k=0;k<4;k++){
            for(int i=0;i<n/2;i++){
                for(int j=0;j<(n+1)/2;j++){
                    int t = mat[i][j];
                    mat[i][j] = mat[n - 1 - j][i];
                    mat[n - 1 - j][i] = mat[n - 1 - i][n - 1 - j];
                    mat[n - 1 - i][n - 1 - j] = mat[j][n - 1 - i];
                    mat[j][n - 1 - i] = t;
                }
            }
            if(isEqual(mat, target)){
                return true;
            }
        }
        return false;
    }
    private boolean isEqual(int[][]a, int[][]b){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=b[i][j]) return false;
            }
        }
        return true;
    }
}