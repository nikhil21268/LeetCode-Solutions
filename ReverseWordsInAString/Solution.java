package ReverseWordsInAString;

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        String newString = new String();
        for(int i = words.length - 1; i >= 0; i--){
            if(words[i].equals("")) continue;
            newString += words[i] + " ";
        }
        return newString.trim();
    }
}