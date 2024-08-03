package LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // compare each character of each string, starting from the front
        // if the character is the same for all strings, add it to the prefix
        // if the character is different, return the prefix
        // if the prefix is empty, return ""
        if(strs.length == 0) return "";
        String prefix = "";
        int charPos = 0;
        int upperBound = -1;
        for(String str: strs){
            if(upperBound == -1) upperBound = str.length();
            else upperBound = Math.min(upperBound, str.length());
        }
        while(charPos < upperBound){
            char currentChar = strs[0].charAt(charPos);
            for(String str: strs){
                if(str.charAt(charPos) != currentChar) return prefix;
            }
            prefix += currentChar;
            charPos++;
        }
        return prefix;
    }
}