package ExcelSheetColNumber;

import java.util.HashMap;

class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for(char c='A'; c<='Z'; c++){
            alphabetMap.put(c, (int)c - (int)'A' + 1);
        }

        int n = columnTitle.length();
        while(n != 0){
            // char
            n--;
        }
        return -1;
    }
}