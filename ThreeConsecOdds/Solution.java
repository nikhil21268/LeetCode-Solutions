package ThreeConsecOdds;

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        for (int i = 2; i < arr.length; i++) {

            int a = arr[i - 2];
            int b = arr[i - 1];
            int c = arr[i];

            if(a % 2 != 0 && b % 2 != 0 && c % 2 != 0) return true;

        }

        return false;

    }
}