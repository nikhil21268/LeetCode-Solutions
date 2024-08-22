package SortOddEvenIndicesSeparately;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] sortEvenOdd(int[] nums) {

        int[] res = new int[nums.length];
        int[] oddArr;
        int[] evenArr;

        if(nums.length % 2 == 0){
            oddArr = new int[nums.length / 2];
            evenArr = new int[nums.length / 2];
        }

        else{
            oddArr = new int[nums.length/2 + 1];
            evenArr = new int[nums.length / 2];
        }

        int i = 0;
        int oddIdx = 0;
        while (i < nums.length){

            oddArr[oddIdx] = nums[i];

            i += 2;
            oddIdx++;
        }

        int j = 1;
        int evenIdx = 0;
        while (j < nums.length){

            evenArr[evenIdx] = nums[j];

            j += 2;
            evenIdx++;
        }

        Arrays.sort(oddArr);
        Arrays.sort(evenArr);

        int l = 0;
        int r = evenArr.length - 1;
        while (l < r){

            int temp = evenArr[l];
            evenArr[l] = evenArr[r];
            evenArr[r] = temp;

            l++;
            r--;
        }

        int idx = 0;
        l = 0;
        r = 0;
        while (idx < nums.length){
            if(idx % 2 == 0) {
                res[idx] = oddArr[l];
                idx++;
                l++;
            }
            else {
                res[idx] = evenArr[r];
                r++;
                idx++;
            }
        }

        return res;

    }
}