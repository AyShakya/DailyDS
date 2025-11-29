class Solution {
    public int numIslands(char[][] grid) {
        int c = 0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    c++;
                    dfs(i,j,grid,visited);
                }
            }
        }
        return c;
    }
    public static void dfs(int r, int c, char[][] grid, boolean[][] visited){
        if(r<0 || r>=visited.length || c<0 || c>=visited[0].length || visited[r][c] || grid[r][c]=='0'){
            return;
        }
        visited[r][c] = true;
        dfs(r+1,c,grid,visited);
        dfs(r,c+1,grid,visited);
        dfs(r-1,c,grid,visited);
        dfs(r,c-1,grid,visited);
    }
}