package IsSubsequence;

class Solution {
    public boolean isSubsequence(String s, String t) {

        int l = 0;
        int r = 0;

        while (l < s.length() && r < t.length()){

            if(t.charAt(r) == s.charAt(l)){
                l++;
                r++;
            }

            else{
                r++;
            }

        }

        return l == s.length();
    }
}
