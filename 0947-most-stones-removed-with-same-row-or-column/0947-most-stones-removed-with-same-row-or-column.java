class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        if(n<=1){
            return 0;
        }

        List<Integer>[]graph = new List[n];

        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i<n;i++){
            int u[] = stones[i];
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                int v[] = stones[j];

                if(u[0]==v[0] || u[1]==v[1]){
                    graph[i].add(j);
                }
            }
        }

        boolean vis[]  = new boolean[n];
        int ans=0;

        for(int i=0;i<n;i++){
            if(vis[i]){
                continue;
            }

            DFS(graph,vis,i);
            ans++;
        }

        return n-ans;
    }

    public void DFS(List<Integer>[] graph, boolean vis[],int start){
        vis[start]=true;

        List<Integer> list = graph[start];
        for(int x:list){
            if(vis[x]){
                continue;
            }

            DFS(graph,vis,x);
        }
    }
}