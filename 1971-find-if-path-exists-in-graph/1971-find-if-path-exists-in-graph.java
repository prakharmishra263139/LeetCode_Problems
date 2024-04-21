class Solution {

    private boolean dfs(List<List<Integer>> adjList, int source, int dest, boolean[] vis) {
        if (source == dest) {
            return true;
        }
        vis[source] = true;

        for (int neighbor : adjList.get(source)) {
            if (!vis[neighbor]) {
                if (dfs(adjList, neighbor, dest, vis))
                    return true;
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int dest) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean[] vis = new boolean[n];

        return dfs(adjList, source, dest, vis);
    }
}
