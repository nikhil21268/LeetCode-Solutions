package UniquePaths2;

class Solution {
   public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       int m = obstacleGrid.length;
       int n = obstacleGrid[0].length;
       int[][] memory = new int[m][n];
       // fill up the last row of the memory with 1s. If there's an obstacle, fill that cell and all the cells to the left of it with 0s
       int obstacleFound = 0;
       for(int j = n - 1; j >= 0; j--){
           if(obstacleFound == 1) memory[m - 1][j] = 0;
           else if(obstacleGrid[m - 1][j] != 1){
               memory[m - 1][j] = 1;
           } else if(obstacleGrid[m - 1][j] == 1){
               memory[m - 1][j] = 0;
               obstacleFound = 1;
           }

       }
       // fill up the last column of the memory with 1s. If there's an obstacle, fill that cell and all the cells above it with 0s
       obstacleFound = 0;
       for(int i = m - 1; i >= 0; i--){
           if(obstacleFound == 1) memory[i][n - 1] = 0;
           else if(obstacleGrid[i][n - 1] != 1){
               memory[i][n - 1] = 1;
           } else if(obstacleGrid[i][n - 1] == 1){
               memory[i][n - 1] = 0;
               obstacleFound = 1;
           }
       }
       // fill up the rest of the memory array using memory[i][j] = memory[i + 1][j] + memory[i][j + 1]
       for(int i = m - 2; i >= 0; i--){
           for(int j = n - 2; j >= 0; j--){
               memory[i][j] = obstacleGrid[i][j] == 1 ? 0 : memory[i + 1][j] + memory[i][j + 1];
           }
       }
       return memory[0][0];
   }
}