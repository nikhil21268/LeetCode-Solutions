package BeautifulPairs;

class Solution {

    public boolean checkCoPrime(int a, int b){

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a == 1;

    }

    public int countBeautifulPairs(int[] nums) {

        int res = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            int dig = -1;

            while (num != 0){
                dig = num % 10;
                num = num / 10;
            }

            int first = dig;

            for (int j = i + 1; j < nums.length; j++) {

                int last = nums[j] % 10;

                if(checkCoPrime(first, last)) res++;

            }

        }

        return res;

    }
}