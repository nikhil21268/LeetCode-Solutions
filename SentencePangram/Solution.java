package SentencePangram;

class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean res = true;

        int[] freqArr = new int[26];

        for(char c: sentence.toCharArray()){
            freqArr[(int)(c - 'a')]++;
        }

        for(int i: freqArr){
            if(i == 0) return false;
        }

        return res;

    }
}