package WordPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, Integer> setPattern = new HashMap<>();
        HashMap<String, Integer> setS = new HashMap<>();

        int idx = 0;
        ArrayList<Integer> firstPattern = new ArrayList<>();
        ArrayList<Integer> secondPattern = new ArrayList<>();

        for(char c: pattern.toCharArray()){
            if(!setPattern.containsKey(c)){
                idx++;
                setPattern.put(c, idx);
            }
            firstPattern.add(setPattern.get(c));
        }

        idx = 0;
        for(String str: s.split(" ")){
            if(!setS.containsKey(str)){
                idx++;
                setS.put(str, idx);
            }
            secondPattern.add(setS.get(str));
        }


        if(firstPattern.size() != secondPattern.size()){
            return false;
        }

        for(int i = 0; i < firstPattern.size(); i++){
            if(firstPattern.get(i) != secondPattern.get(i)){
                return false;
            }
        }

        return true;
    }
}
