package Practice.LongestSubstringWORepeatingChar;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int max = -1;
        if(s.length() == 0 || s.length() == 1) return s.length();
        while(r < s.length()){
            // expand if no repeating char
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                max = Math.max(max, r - l + 1);
                r++;
            }
            else{
                set.clear();
                l++;
                r = l;
            }
        } return max;
    }
}
