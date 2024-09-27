class Solution {
    public int findCircleNum(int[][] isConnected) {
        int answer =0;

        for(int i=0;i<isConnected.length;i++){
            if(isConnected[i][i]==1){
                answer++;
                helper(isConnected,i);
            }
        }

        return answer;
   
    }

    private static void helper(int [][] isConnected, int i){
        int edges[] = isConnected[i];
        if(edges[i]==1){
            edges[i]=0;
            for(int j=0;j<edges.length;j++){
                if(edges[j]==1){
                    edges[j]=0;
                    helper(isConnected,j);
                }
            }
        }
    }
}