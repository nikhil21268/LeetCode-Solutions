package CommonCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {

        List<String> res = new ArrayList<>();

        int[] freqCount = new int[26];
        int firstOne = 0;

        for(String str: words){

            char[] charArr = str.toCharArray();

            if(firstOne == 0){

                firstOne = 1;

                for(char c: charArr) freqCount[(int)(c - 'a')]++;

            }

            else {

                int[] otherCharArr = new int[26];

                for(char c: charArr) otherCharArr[(int)(c - 'a')]++;

                for (int i = 0; i < 26; i++) {

                    freqCount[i] = Math.min(freqCount[i], otherCharArr[i]);

                }

            }

        }

        for (int i = 0; i < 26; i++) {

            if(freqCount[i] > 0){

                while (freqCount[i] != 0){
                    res.add((char)(i + 'a') + "");
                    freqCount[i]--;
                }
            }

        }

        return res;

    }
}