import java.util.*;

class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<Integer>[] graph = new ArrayList[n];

        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Graph create
        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            graph[u].add(v);
            graph[v].add(u); // Undirected graph
        }

        boolean[] vis = new boolean[n];

        return hasPath(graph, source, destination, vis);
    }

    public boolean hasPath(ArrayList<Integer>[] graph,
                           int src,
                           int dest,
                           boolean[] vis) {

        if(src == dest) {
            return true;
        }

        vis[src] = true;

        for(int i = 0; i < graph[src].size(); i++) {

            int neighbour = graph[src].get(i);

            if(!vis[neighbour]) {

                if(hasPath(graph, neighbour, dest, vis)) {
                    return true;
                }
            }
        }

        return false;
    }
}