class Solution {
    public void dfs(boolean[] visit, int[][] is, int s){
        visit[s] = true;
        for(int i=0;i<is.length;i++){
            if(visit[i] || is[s][i]==0) continue;
            dfs(visit, is, i);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        boolean[] visit = new boolean[v];
        int c = 0;
        for(int i=0;i<v;i++){
            if(!visit[i]){
                c++;
                dfs(visit, isConnected, i);
            }
        }
        return c;
    }
}