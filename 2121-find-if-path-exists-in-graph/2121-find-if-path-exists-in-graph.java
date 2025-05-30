class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination){
            return true;
        }
        List<Integer>[] Adj = new List[n];
        for(int i=0;i<n;i++){
            Adj[i] = new ArrayList<>();
        }
        for(int i[] : edges){
            int a=i[0];
            int b=i[1];
            Adj[a].add(b);
            Adj[b].add(a);
        }
        int status[] = new int[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        status[source]=1;
        while(!q.isEmpty()){
            int x = q.poll();
            for(int y : Adj[x]){
                if(status[y]==0){
                    status[y]=1;
                    q.offer(y);
                }
                if(y==destination){
                    return true;
                }
            }
        }
        return false;
    }
}