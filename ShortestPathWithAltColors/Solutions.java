package ShortestPathWithAltColors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        HashMap<Integer, List<Integer>> redMap = new HashMap<>();
        HashMap<Integer, List<Integer>> blueMap = new HashMap<>();
        for(int i = 0; i < redEdges.length; i++){
            redMap.putIfAbsent(redEdges[i][0], new ArrayList<>());
            redMap.get(redEdges[i][0]).add(redEdges[i][1]);
        }
        for(int i = 0; i < blueEdges.length; i++){
            blueMap.putIfAbsent(blueEdges[i][0], new ArrayList<>());
            blueMap.get(blueEdges[i][0]).add(blueEdges[i][1]);
        }
        int[] res = new int[n];
        Arrays.fill(res, -1);
        res[0] = 0;
    }
}
