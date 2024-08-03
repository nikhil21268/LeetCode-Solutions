package removeStarsFromAString;

import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '*'){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        String finalStr = stack.toString();
        return finalStr.substring(1, finalStr.length() - 1).replace(", ", "");
    }
}