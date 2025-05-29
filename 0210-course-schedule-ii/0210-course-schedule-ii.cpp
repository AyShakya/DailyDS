class Solution {
public:
    bool DFS_Cycle(vector<vector<int>>& Adj, vector<int>& status, int i, vector<int>& InChain) {
        status[i] = 1;
        InChain[i] = 1;
        for (int j : Adj[i]) {
            if (status[j] == 0) {
                if (DFS_Cycle(Adj, status, j, InChain)) {
                    return true;
                }
            } else {
                if (InChain[j] == 1) {
                    return true;
                }
            }
        }
        InChain[i] = 0;
        return false;
    }

    bool CycleDetection(vector<vector<int>>& Adj, int V) {
        vector<int> status(V, 0);
        vector<int> InChain(V, 0);
        for (int i = 0; i < V; i++) {
            if (status[i] == 0) {
                if (DFS_Cycle(Adj, status, i, InChain)) {
                    return true;
                }
            }
        }
        return false;
    }

    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        vector<int> result;
        vector<vector<int>> Adj(numCourses);
        for (auto& p : prerequisites) {
            int a = p[0];
            int b = p[1];
            Adj[b].push_back(a);
        }
        if (CycleDetection(Adj, numCourses)) {
            return result;
        }
        vector<int> InDeg(numCourses, 0);
        for (int i = 0; i < numCourses; i++) {
            for (int j : Adj[i]) {
                InDeg[j]++;
            }
        }
        queue<int> Q;
        for (int i = 0; i < numCourses; i++) {
            if (InDeg[i] == 0) {
                Q.push(i);
                result.push_back(i);
            }
        }
        while (!Q.empty()) {
            int x = Q.front();
            Q.pop();
            for (int y : Adj[x]) {
                InDeg[y]--;
                if (InDeg[y] == 0) {
                    Q.push(y);
                    result.push_back(y);
                }
            }
        }
        if (result.size() != numCourses) {
            return {};
        }
        return result;
    }
};
