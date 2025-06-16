class Solution {
    private boolean binary(int [][] num, int x, int i, int j, int b){
        while(j<=b){
            int mid = (j+b)/2;
            if(num[i][mid]==x){
                return true;
            }
            else{
                if(num[i][mid]>x){
                    b=mid-1;
                }
                else{
                    j=mid+1;
                }
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(binary(matrix, target, i,0,matrix[i].length-1)){
                return true;
            }
        }
        return false;
    }
}