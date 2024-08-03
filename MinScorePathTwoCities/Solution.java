package MinScorePathTwoCities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    class Pair{
        int node;
        int weight;
        Pair(int node, int score){
            this.node = node;
            this.weight = score;
        }
    }
    HashMap<Integer, ArrayList<Pair>> adj;
    int res = Integer.MAX_VALUE;
    HashSet<Integer> visited = new HashSet<>();
    public void dfs(int node){
        if(visited.contains(node)) return;
        ArrayList<Pair> neighbors = adj.get(node);
        visited.add(node);
        for(Pair neighbor:neighbors){
            res = Math.min(res, neighbor.weight);
            dfs(neighbor.node);
        }
    }
    public int minScore(int n, int[][] roads) {
        adj = new HashMap<>();
        for(int i = 1; i <= n; i++){
            adj.put(i, new ArrayList<>());
        }
        for(int[] arr:roads){
            int src = arr[0];
            int dest = arr[1];
            int weight = arr[2];
            adj.get(src).add(new Pair(dest, weight));
            adj.get(dest).add(new Pair(src, weight));
        }
        dfs(1);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}