package IsomorphicStrings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        int idx = 1;

        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){

            if(map.containsKey(c)) {

                sb.append(map.get(c));
            }

            else {

                map.put(c, idx);

                sb.append(idx);

                idx++;
            }

        }


        map = new HashMap<>();

        idx = 1;

        StringBuilder sb2 = new StringBuilder();

        for(char c: t.toCharArray()){

            if(map.containsKey(c)) {

                sb2.append(map.get(c));
            }

            else {

                map.put(c, idx);

                sb2.append(idx);

                idx++;
            }

        }


        if(sb.length() != sb2.length()) return false;

        for(int i = 0; i < sb.length(); i++){

            if(sb.charAt(i) != sb2.charAt(i)) return false;
        }


        return true;
    }
}