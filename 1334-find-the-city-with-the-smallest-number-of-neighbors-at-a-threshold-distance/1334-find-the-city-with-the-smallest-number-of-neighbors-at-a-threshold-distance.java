class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        long [][] matrix = new long[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    matrix[i][j]=0L;
                }else{
                    matrix[i][j]=Long.MAX_VALUE/2;
                }
            }
        }

        for(int edge[] :edges){
            int a = edge[0];
            int b = edge[1];

            int cost = edge[2];

            matrix[a][b]= cost;
            matrix[b][a]= cost;

            
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    long newCost = matrix[i][k]+matrix[k][j];
                    if(newCost<matrix[i][j]){
                        matrix[i][j]=newCost;
                    }
                }
            }
        }

        int station=-1;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]<=distanceThreshold){
                    count++;
                }
            }

            if(count<=min){
                min=count;
                station=i;
            }
        }

        return station;
        
    }
}