package NumberOf1Bits;

class Solution {

    public String doIt(int n){

        StringBuilder res = new StringBuilder();

        while(n != 0){

            int digit = n % 2;
            res.append(digit);

            n = n / 2;
        }

        return res.reverse().toString();
    }

    public int hammingWeight(int n) {

        int res = 0;

        String binary = doIt(n);

        for(char c: binary.toCharArray()){

            if(c == '1') res++;
        }

        return res;
    }
}
