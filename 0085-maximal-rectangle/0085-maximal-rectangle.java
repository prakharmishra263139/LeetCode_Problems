class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) {
            return 0;
        }
        int rows=matrix.length;
        int columns=matrix[0].length;
        int[][] memo=new int[rows][columns];
         int Area=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(matrix[i][j]=='1'){
                    memo[i][j]=(j==0) ? 1 : memo[i][j-1]+1;
                    int width=memo[i][j];
                    for(int k=i; k>=0; k--){
                        width=Math.min(width,memo[k][j]);
                        Area=Math.max(Area,width*(i-k+1));
                    }
                }
            }
        }
    return Area;
    }
}