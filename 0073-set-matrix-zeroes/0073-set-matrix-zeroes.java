class Solution {
    public void setZeroes(int[][] matrix) {
        Map<Integer,Integer> counti = new HashMap<>();
        Map<Integer,Integer> countj = new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    counti.put(i,1);
                    countj.put(j,1);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(counti.containsKey(i)){
                   matrix[i][j]=0; 
                }
                if(countj.containsKey(j)){
                    matrix[i][j]=0; 
                }
            }
        }
    }
}