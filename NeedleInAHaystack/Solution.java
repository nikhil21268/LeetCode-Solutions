package NeedleInAHaystack;

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        int needlePtr = 0;
        int haystackPtr = 0;
        int firstCharFlag = 1;
        while(needlePtr <= needle.length()){
            if(needle.charAt(needlePtr) != haystack.charAt(haystackPtr)){
                // keep incrementing haystackPtr until the character matches with the current character of the needle
                // but this must only occur when we're checking the first character of the needle, not otherwise
                while(firstCharFlag == 1 && haystackPtr < haystack.length() && needle.charAt(needlePtr) != haystack.charAt(haystackPtr)){
                    haystackPtr++;
                } // after this loop, haystackPtr is at the location where the characters match
                if(haystackPtr == haystack.length()) return -1;
                firstCharFlag = 0;
                needlePtr++;
            }
        }
        return -1;
    }
}