package OnesAndZeroes;

import java.util.HashMap;

class Solution {
    HashMap<String, Integer> dp = new HashMap<>();
    public int dfs(String[] strs, int m, int n, int i){
        if(i == strs.length) return 0;
        if(dp.containsKey(i + " " + m + " " + n)) return dp.get(i + " " + m + " " + n);
        int[] count = new int[2];
        for(char c : strs[i].toCharArray()){
            count[c - '0']++;
        }
        dp.put(i + " " + m + " " + n, Math.max(dfs(strs, m, n, i + 1), (m >= count[0] && n >= count[1]) ? 1 + dfs(strs, m - count[0], n - count[1], i + 1) : 0));
        return dp.get(i + " " + m + " " + n);
    }
    public int findMaxForm(String[] strs, int m, int n) {
        return dfs(strs, m, n, 0);
    }
}