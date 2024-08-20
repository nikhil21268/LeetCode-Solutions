package NUniqueIntegersSumToZero;

class Solution {
    public int[] sumZero(int n) {

        int[] res = new int[n];


        if(n % 2 != 0){
            int start = -(n / 2);
            for (int i = 0; i < n; i++) {
                res[i] = start;
                start++;
            }
        }

        else{
            int start = -(n / 2);
            for (int i = 0; i < n; i++) {
                if(start == 0) start++;
                res[i] = start;
                start++;
            }
        }

        return res;

    }
}