class Solution {
    int rows;
    int cols;
    public int getMaximumGold(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
       int max=0;

       boolean visited[][]= new boolean[rows][cols];
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
           if(grid[i][j]!=0){
           max = Math.max(max,dfs(i,j,grid,visited));
           }
        }
     } 
       return max;
    }

    public int dfs(int row,int col,int grid[][],boolean visited[][]){
    if(row<0 || row>=rows || col<0 || col>=cols || grid[row][col]==0 || visited[row][col] )
    {
        return 0;
    }

    visited[row][col]=true;
    int max = 0;

    int dir[][] = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};

    for(int i=0;i<4;i++){
        int nextRow = row+dir[i][0];
        int nextCol = col+dir[i][1];
        max = Math.max(max,dfs(nextRow,nextCol,grid,visited));
    }


    visited[row][col]=false;

    return grid[row][col]+max;
}
}