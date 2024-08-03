package NumberOfClosedIslands;

import java.util.Arrays;

class Solution {
    int[][] visited;
    public int dfs(int[][] grid, int i, int j){
        // 0 <- return false & 1 <- return true
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return 0;
        if(visited[i][j] == 1 || grid[i][j] == 1) return 1;
        visited[i][j] = 1;
        return Math.min(dfs(grid, i + 1, j), Math.min(dfs(grid, i - 1, j), Math.min(dfs(grid, i, j + 1), dfs(grid, i, j - 1))));
    }
    public int closedIsland(int[][] grid) {
        visited = new int[grid.length][grid[0].length];
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(visited[i][j] == 0 && grid[i][j] == 0) res += dfs(grid, i, j);
            }
        } return res;
    }
}