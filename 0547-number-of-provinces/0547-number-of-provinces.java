class Solution {
    public void dfs(int[] visit, ArrayList<ArrayList<Integer>> adj, int s){
        visit[s] = 1;
        for(Integer i : adj.get(s)){
            if(visit[i]==0){
                dfs(visit, adj, i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        int[] visit = new int[v+1];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int c=0;
        for(int i=0;i<v;i++){
            if(visit[i]==0){
                c++;
                dfs(visit,adj,i);
            }
        }
        return c;
    }
}