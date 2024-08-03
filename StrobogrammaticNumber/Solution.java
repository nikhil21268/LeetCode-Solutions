package StrobogrammaticNumber;

import java.util.HashMap;

class Solution {
    public boolean isStrobogrammatic(String num) {

        boolean res = false;

        HashMap<Character, Character> rotMap = new HashMap<>();

        rotMap.put('6', '9');
        rotMap.put('9', '6');
        rotMap.put('8', '8');
        rotMap.put('0', '0');

        StringBuilder newNum = new StringBuilder();
        for(char c: num.toCharArray()){
            if(!rotMap.containsKey(c)) return false;
            else newNum.append(rotMap.get(c));
        }

        return newNum.toString().equals(num);

    }
}