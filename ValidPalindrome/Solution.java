package ValidPalindrome;


class Solution {
    public boolean isPalindrome(String s) {

        boolean res = true;

        StringBuilder str = new StringBuilder();

        for(char c: s.toCharArray()){

            if(Character.isLetter(c) || Character.isDigit(c)){

                str.append(Character.toLowerCase(c));
            }
        }

        String string = str.toString();


        if(string.length() % 2 == 0){

            int l = string.length() / 2 - 1;
            int r = l + 1;


            while(l >= 0 && r < string.length()){

                if(string.charAt(l) != string.charAt(r)) return false;

                l--;
                r++;
            }

            return res;
        }

        else{


            if(string.length() == 1) return res;


            int l = (string.length() / 2) - 1;
            int r = l + 2;

            while(l >= 0 && r < string.length()){

                if(string.charAt(l) != string.charAt(r)) return false;

                l--;
                r++;
            }

            return res;
        }
    }
}