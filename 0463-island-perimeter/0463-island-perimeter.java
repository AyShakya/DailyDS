class Pair {
    int first, second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int islandPerimeter(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int status[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new Pair(i,j));
                    status[i][j]=2;
                    break;
                }
            }
            if(!q.isEmpty()){
                break;
            }
        }
        int peri=0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int i = p.first;
            int j = p.second;
            if(i+1<n){
                if(status[i+1][j]!=2){
                    if(grid[i+1][j]==1){
                        q.add(new Pair(i+1,j));
                        status[i+1][j]=2;
                    }
                    else{
                        peri++;
                    }   
                }
            }
            else{
                peri++;
            }
            if(i-1>=0){
                if(status[i-1][j]!=2){
                    if(grid[i-1][j]==1){
                       q.add(new Pair(i-1,j));
                        status[i-1][j]=2;
                    }
                    else{
                        peri++;
                    }
                }
            }
            else{
                peri++;
            }
            if(j+1<m){
                if(status[i][j+1]!=2){
                    if(grid[i][j+1]==1){
                        q.add(new Pair(i,j+1));
                        status[i][j+1]=2;
                    }
                    else{
                        peri++;
                    }
                } 
            }
            else{
                peri++;
            }
            if(j-1>=0){
                if(status[i][j-1]!=2){
                    if(grid[i][j-1]==1){
                        q.add(new Pair(i,j-1));
                        status[i][j-1]=2;
                    }
                    else{
                        peri++;
                    }
                }
            }
            else{
                peri++;
            }
        }
        return peri;
    }
}