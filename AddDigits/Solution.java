package AddDigits;

class Solution {
    public int sumDigits(int rem){
        int sum = 0;
        while(rem != 0){
            int unitDigit = rem % 10;
            sum += unitDigit;
            rem = rem / 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int rem = num;
        while(rem / 10 >= 1){
            rem = sumDigits(rem);
        }
        return rem;
    }
}