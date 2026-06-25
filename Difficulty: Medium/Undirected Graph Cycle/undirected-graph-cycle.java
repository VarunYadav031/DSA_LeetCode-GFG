class Solution {

    public boolean isCycle(int V, int[][] edges) {

        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(edges, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(int[][] edges,
                                          boolean[] vis,
                                          int curr,
                                          int par) {

        vis[curr] = true;

        for (int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            int neigh = -1;

            if (u == curr) {
                neigh = v;
            } else if (v == curr) {
                neigh = u;
            } else {
                continue;
            }

            if (!vis[neigh]) {

                if (detectCycleUtil(edges, vis, neigh, curr)) {
                    return true;
                }

            } else if (neigh != par) {
                return true;
            }
        }

        return false;
    }
}