package ReverseString2;

class Solution {
    public String reverseStr(String s, int k) {

        StringBuilder res = new StringBuilder(s);

        if(res.length() == 1) return res.toString();

        int i = 0;
        while (i < res.length()){

            int l = i;
            int r = i + k - 1;

            while (l < r){

                if(r >= res.length()) r = res.length() - 1;

                char c = res.charAt(l);

                res.setCharAt(l, res.charAt(r));
                res.setCharAt(r, c);

                l++;
                r--;
            }

            i += 2 * k;

        }

        return res.toString();

    }
}