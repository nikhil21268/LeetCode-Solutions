package PivotInteger;

class Solution {

    public int check(int n, int masterN){

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum += i;
        }

        for (int i = n; i <= masterN; i++) {
            rightSum += i;
        }

        if(leftSum == rightSum) return 0;

        if(rightSum > leftSum) return 1;

        return -1;

    }

    public int pivotInteger(int n) {

        int res = -1;

        int l = 0;
        int r = n;

        while(l <= r){
            int mid = l + (r - l) / 2;
            if(check(mid, n) == 0) return mid;
            else if(check(mid, n) > 0){
                // right is greater -> move right
                l = mid + 1;
            } else if (check(mid, n) < 0) {
                r = mid - 1;
            }
        }

        return res;

    }
}