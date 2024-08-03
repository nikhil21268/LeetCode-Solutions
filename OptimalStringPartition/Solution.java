package OptimalStringPartition;

import java.util.HashSet;

class Solution {
    public int partitionString(String s) {
        int len = s.length();
        if(len == 1) return 1;
        int l = 0;
        int r = 0;
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            } else{
                res++;
                set.clear();
                set.add(c);
            }
        } return res;
    }
}