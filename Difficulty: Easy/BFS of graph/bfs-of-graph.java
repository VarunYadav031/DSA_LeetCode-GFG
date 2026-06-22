import java.util.*;

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[adj.size()];

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {

            int curr = q.remove();
            ans.add(curr);

            for (int nbr : adj.get(curr)) {

                if (!visited[nbr]) {
                    visited[nbr] = true;
                    q.add(nbr);
                }
            }
        }

        return ans;
    }
}