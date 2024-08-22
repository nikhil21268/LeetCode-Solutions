package SubtractProductAndSumOfDigits;

class Solution {
    public int subtractProductAndSum(int n) {

        int productDig = 1;
        int sumDig = 0;

        while (n != 0){

            int dig = n % 10;
            n = n / 10;

            productDig = productDig * dig;
            sumDig += dig;
        }

        return productDig - sumDig;

    }
}