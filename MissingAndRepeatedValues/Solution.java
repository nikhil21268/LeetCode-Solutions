package MissingAndRepeatedValues;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int[] res = new int[2];

        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[grid.length * grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(set.contains(grid[i][j])) res[0] = grid[i][j];
                set.add(grid[i][j]);
                arr[grid[i][j] - 1]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) res[1] = i+1;
        }

        return res;

    }
}