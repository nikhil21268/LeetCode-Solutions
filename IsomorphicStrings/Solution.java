package IsomorphicStrings;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        int m = s.length();
        int n = t.length();
        if(m != n) return false;

        int[] arr1 = new int[m];
        int[] arr2 = new int[m];

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int idx = 1;
        for(char c: s.toCharArray()){
            if(!map1.containsKey(c)){
                map1.put(c, idx);
                idx++;
            }
        }

        idx = 1;
        for(char c: t.toCharArray()){
            if(!map2.containsKey(c)){
                map2.put(c, idx);
                idx++;
            }
        }

        idx = 0;
        for(char c: s.toCharArray()){
            arr1[idx] = map1.get(c);
            idx++;
        }

        idx = 0;
        for(char c: t.toCharArray()){
            arr2[idx] = map2.get(c);
            idx++;
        }

        return Arrays.equals(arr1, arr2);

    }
}