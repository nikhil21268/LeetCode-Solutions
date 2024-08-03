package WordBreak;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        Arrays.fill(dp, false);
        // we process string s from right to left
        // base case: empty string is always present in the dictionary
        dp[s.length()] = true;
        // idx <- current position in the string s
        int idx = s.length() - 1;
        while(idx >= 0){
            for(String word: wordDict){
                int len = word.length();
                if(s.substring(idx, idx + len).equals(word)){
                    dp[idx] = true;
                    idx--;
                }
            }
        } return false;
    }
}