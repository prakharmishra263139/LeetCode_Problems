class Solution {

    public int findMax(int [][]grid,int row, int col){
        int maxVal = Integer.MIN_VALUE;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                maxVal = Math.max(maxVal,grid[i][j]);
        }
     }
     return maxVal;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;

        int ans[][] =new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                ans[i][j]=findMax(grid,i,j);
            }
        }

        return ans;
    }
}