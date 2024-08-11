class Solution {
    static int directions[][] = {{-1,0},{0,1},{0,-1},{1,0}};
    
    public void connected(int grid[][], int i, int j, boolean [][] visited){
        visited[i][j] = true;

        for(int d = 0; d < 4; d++){
            int r = i + directions[d][0];
            int c = j + directions[d][1];
            if(r >= 0 && r < grid.length && c >= 0  && c < grid[0].length && grid[r][c] == 1 && visited[r][c] == false){
                connected(grid, r, c, visited);
            }
        }
    }

    public int isIsland(int grid[][]){
        int count = 0;
        boolean vis[][] = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && vis[i][j] == false){
                    count++;
                    connected(grid, i, j, vis);
                }
            }
        }

        return count;
    }

    public int minDays(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        if(isIsland(grid) == 0){ 
            return 0;
        }

        if(isIsland(grid) > 1){  
            return 0;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    grid[i][j] = 0;  

                    if(isIsland(grid) != 1){
                        return 1;  
                    }
                    grid[i][j] = 1; 
                }
            }
        }

        return 2;  
    }
}
