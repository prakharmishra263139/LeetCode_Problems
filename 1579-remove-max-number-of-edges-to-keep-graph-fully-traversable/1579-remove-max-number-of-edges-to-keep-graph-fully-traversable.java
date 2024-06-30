class DisjointSet {
    int parent[];
    int size[];
    int components;

    DisjointSet(int nodes){
        this.parent = new int[nodes+1];
        this.size = new int[nodes+1];
        this.components = nodes;

        for(int i=0;i<nodes;i++){
            this.parent[i]=i;
            this.size[i]=1;
        }
    }

     public int findRoot(int node){
        if(node == parent[node]){
            return node;
        }
        parent[node] = findRoot(parent[node]);
        return parent[node];
    }

    public int  unionbySize(int node1 ,int node2){
        int root1= findRoot(node1);
        int root2 = findRoot(node2);

        if(root1==root2){
            return 0;
        }

        components--;

        if(size[root1]<size[root2]){
            parent[root1] = root2;
            size[root2]+=size[root2];
        }else{
            parent[root2] = root1;
            size[root1]+=size[root2];
        }

        return 1;
    }
}

class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        DisjointSet alice = new DisjointSet(n);
        DisjointSet bob = new DisjointSet(n); 

        int edgesReq=0;

        for(int edge[]:edges){
            if(edge[0]==3){
               edgesReq +=  alice.unionbySize(edge[1],edge[2]) | bob.unionbySize(edge[1],edge[2]);
            }
        }

         for(int edge[]:edges){
            if(edge[0]==1){
               edgesReq +=  alice.unionbySize(edge[1],edge[2]) ;
            }

            if(edge[0]==2){
               edgesReq +=  bob.unionbySize(edge[1],edge[2]);
            }
        }

         
        if(alice.components==1 && bob.components==1){
            return edges.length-edgesReq;
        }

        return -1;
    }


}