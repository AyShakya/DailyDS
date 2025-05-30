class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int peri=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    peri+=4;
                    if(i-1>=0){
                        if(grid[i-1][j]==1){
                            peri--;
                        }
                    }
                    if(i+1<n){
                        if(grid[i+1][j]==1){
                            peri--;
                        }
                    }
                    if(j-1>=0){
                        if(grid[i][j-1]==1){
                            peri--;
                        }
                    }
                    if(j+1<m){
                        if(grid[i][j+1]==1){
                            peri--;
                        }
                    }
                }
            }
        }
        return peri;
    }
}