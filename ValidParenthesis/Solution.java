package ValidParenthesis;

import java.util.HashSet;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        boolean res = true;

        Stack<Character> stk = new Stack<>();

        HashSet<Character> rightBrackets = new HashSet<>();
        rightBrackets.add(')');
        rightBrackets.add(']');
        rightBrackets.add('}');


        for(char c: s.toCharArray()){

            if(rightBrackets.contains(c)){

                if(stk.isEmpty()) return false;

                Character popped = stk.pop();

                if(c == ')' && popped != '(') return false;
                if(c == ']' && popped != '[') return false;
                if(c == '}' && popped != '{') return false;

            }

            else{

                stk.add(c);
            }
        }

        if(!stk.isEmpty()) return false;

        return res;
    }
}