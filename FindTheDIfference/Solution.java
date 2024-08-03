package FindTheDIfference;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c: s.toCharArray()){
            if(map.containsKey(c)) map.put(c, 1 + map.get(c));
            else{
                map.put(c, 1);
            }
        }
        for(char c: t.toCharArray()){
            if(map2.containsKey(c)) map2.put(c, 1 + map2.get(c));
            else{
                map2.put(c, 1);
            }
        }

        for(Character c: map2.keySet()){
            int times = map2.get(c);
            if(!map.containsKey(c) || times != map.get(c)) return c;
        }
        return 'a';
    }
}
