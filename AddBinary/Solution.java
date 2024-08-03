package AddBinary;

class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        String res = "";
        int carry = 0;
        char currNum = '0';
        int aPtr = m-1;
        int bPtr = n-1;
        while(aPtr >= 0 && bPtr >= 0) {
            if (a.charAt(aPtr) == '1' && b.charAt(bPtr) == '1') {
                // case 1
                if (carry == 1) currNum = '1';
                else currNum = '0';
                carry = 1;
            } else if (a.charAt(aPtr) == '1' && b.charAt(bPtr) == '0') {
                // case 2
                if (carry == 1){
                    currNum = '0';
                    carry = 1;
                }
                else{
                    currNum = '1';
                    carry = 0;
                }
            } else if (a.charAt(aPtr) == '0' && b.charAt(bPtr) == '1') {
                // case 3
                if (carry == 1){
                    currNum = '0';
                    carry = 1;
                }
                else{
                    currNum = '1';
                    carry = 0;
                }
            } else if (a.charAt(aPtr) == '0' && b.charAt(bPtr) == '0') {
                // case 4
                if (carry == 1) currNum = '1';
                else currNum = '0';
                carry = 0;
            }
            res += (char) currNum;
            aPtr--;
            bPtr--;
        }
        while(aPtr >= 0) {
            if (a.charAt(aPtr) == '1') {
                // case 1
                if (carry == 1){
                    currNum = '0';
                    carry = 1;
                }
                else{
                    currNum = '1';
                    carry = 0;
                }
            } else if (a.charAt(aPtr) == '0') {
                // case 3
                if (carry == 1){
                    currNum = '1';
                    carry = 0;
                }
                else{
                    currNum = '0';
                    carry = 0;
                }
            }
            res += (char) currNum;
            aPtr--;
            bPtr--;
        }
        while(bPtr >= 0) {
            if (b.charAt(bPtr) == '1') {
                // case 1
                if (carry == 1){
                    currNum = '0';
                    carry = 1;
                }
                else{
                    currNum = '1';
                    carry = 0;
                }
            } else if (b.charAt(bPtr) == '0') {
                // case 3
                if (carry == 1){
                    currNum = '1';
                    carry = 0;
                }
                else{
                    currNum = '0';
                    carry = 0;
                }
            }
            res += (char) currNum;
            aPtr--;
            bPtr--;
        }
        if(carry == 1) res += '1';
        return new StringBuilder(res).reverse().toString();
    }
}