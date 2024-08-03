package NumberOfEnclaves;

class Solution {
    int[][] visited;
    public int dfs(int[][] grid, int i, int j){
        // 0 <- false & 1 <- true
        if(i >= grid.length || i < 0 || j >= grid[0].length || j < 0) return 0;
        return -1;
    }
    public int numEnclaves(int[][] grid) {
        visited = new int[grid.length][grid[0].length];
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(visited[i][j] == 0 && grid[i][j] == 1) res+= dfs(grid, i, j);
            }
        }
        return -1;
    }
}