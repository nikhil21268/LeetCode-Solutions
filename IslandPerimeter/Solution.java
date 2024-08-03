package IslandPerimeter;

class Solution {


    int res = 0;
    boolean[][] visited;

    public int dfs(int[][] grid, int i, int j){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return 0;

        if(visited[i][j] || grid[i][j] == 0) return grid[i][j];

        visited[i][j] = true;

        if(dfs(grid, i+1, j) == 0) res++;
        if(dfs(grid, i-1, j) == 0) res++;
        if(dfs(grid, i, j+1) == 0) res++;
        if(dfs(grid, i, j-1) == 0) res++;

        return grid[i][j];

    }

    public int islandPerimeter(int[][] grid) {

        visited = new boolean[grid.length][grid[0].length];

        int flg = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if(!visited[i][j] && grid[i][j] == 1){
                    dfs(grid, i, j);
                    flg = 1;
                    break;
                }

            }

            if(flg == 1) break;
        }

        return res;
    }
}

