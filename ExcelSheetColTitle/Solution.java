package ExcelSheetColTitle;

import java.util.HashMap;

class Solution {
    public String convertToTitle(int columnNumber) {
        HashMap<Integer, Character> alphabetMap = new HashMap<>();
        for(char c = 'A'; c <= 'Z'; c++){
            alphabetMap.put((int)c - (int)'A' + 1, c);
        } alphabetMap.put(0, 'Z');

        int mod = 26;
        String res = "";
        StringBuilder stringBuilder = new StringBuilder();
        while(columnNumber != 0){
            int modRes = (columnNumber-1) % mod;
            columnNumber = (columnNumber-1) / mod;
            stringBuilder.append(alphabetMap.get(modRes+1));
        } res = stringBuilder.reverse().toString();
        return res;
    }
}