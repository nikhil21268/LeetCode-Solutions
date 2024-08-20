package ValidAnagram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c: s.toCharArray()){
            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c: t.toCharArray()){
            if(map2.containsKey(c)) map2.put(c, map2.get(c) + 1);
            else map2.put(c, 1);
        }

        if(map2.size() != map.size()) return false;

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(map2.containsKey(entry.getKey())){
                if(!map2.get(entry.getKey()).equals(entry.getValue())){
                    return false;
                }
            }
            else {
                return false;
            }
        }

        return true;
    }
}