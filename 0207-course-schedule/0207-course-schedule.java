class Solution {
    private boolean DFS_Cycle(List<Integer>[] Adj, int[] status, int i, int[] InChain){
        status[i] = 1;
        InChain[i] = 1;
        for (int j : Adj[i]) {
            if (status[j] == 0) {
                if (!DFS_Cycle(Adj, status, j, InChain)) {
                    return false;
                }
            } else {
                if (InChain[j] == 1) {
                    return false;
                }
            }
        }
        InChain[i] = 0;
        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0) {
            return true;
        }
        int[] status = new int[numCourses];
        List<Integer>[] Adj = new List[numCourses];
        for (int i = 0; i < numCourses; i++) {
            Adj[i] = new ArrayList<>();
        }
        for (int[] edge : prerequisites) {
            int a = edge[0];
            int b = edge[1];
            Adj[b].add(a); // b → a (must finish b before a)
        }
        for (int i = 0; i < numCourses; i++) {
            if (status[i] == 0) {
                int[] InChain = new int[numCourses];
                if (!DFS_Cycle(Adj, status, i, InChain)) {
                    return false;
                }
            }
        }
        return true;
    }
}
