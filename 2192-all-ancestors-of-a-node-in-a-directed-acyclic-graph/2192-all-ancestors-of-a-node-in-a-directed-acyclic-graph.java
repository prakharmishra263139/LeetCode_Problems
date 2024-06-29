class Solution {

    public void dfs(List<Integer>[] graph , int curr,boolean vis[],List<Integer>temp){
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            int neigh = graph[curr].get(i);

            if(!vis[neigh]){
                temp.add(neigh);
                dfs(graph,neigh,vis,temp);
            }
        }
    }
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];

        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            graph[v].add(u);
        }

        List<List<Integer>> ans  = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            boolean vis[] = new boolean[n];
            List<Integer> temp  = new ArrayList<>();

            dfs(graph,i,vis,temp);
            Collections.sort(temp);
            ans.add(temp);

        }

        return ans;
    }
}