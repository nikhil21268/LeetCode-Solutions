package LetterCombinationsOfPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        HashMap<Integer, Character> map = new HashMap<>();

        int idx = 2;
        for(char c = 'a'; c <= 'z'; c += 3){
            map.put(idx, c);
            map.put(idx, (char)(c + 1));
            map.put(idx, (char)(c + 2));
            idx++;
        }
        map.put(idx-1, 'z');

        for(char c: digits.toCharArray()){

        }

        return res;
    }
}
