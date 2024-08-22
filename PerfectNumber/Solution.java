package PerfectNumber;

class Solution {
    public boolean checkPerfectNumber(int num) {

        int sumPositiveDivs = 0;

        for(int i = 1; i <= num/2; i++){

            if(num % i == 0) sumPositiveDivs += i;

        }

        return sumPositiveDivs == num;

    }
}