package RotateString;

class Solution {
    public boolean rotateString(String s, String goal) {

        StringBuilder sb = new StringBuilder(s);

        if(s.equals(goal)) return true;

        int tryShift = 0;

        while (tryShift != s.length()){

            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);

            if(sb.toString().equals(goal)) return true;

            tryShift++;
        }

        return false;
    }
}