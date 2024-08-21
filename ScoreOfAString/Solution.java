package ScoreOfAString;

class Solution {
    public int scoreOfString(String s) {

        int res = 0;

        int[] asciiArr = new int[s.length()];

        int idx = 0;
        for(char c: s.toCharArray()){
            asciiArr[idx] = (int)(c);
            idx++;
        }

        for (int i = 0; i < s.length()-1; i++) {
            res += Math.abs(asciiArr[i] - asciiArr[i+1]);
        }

        return res;

    }
}