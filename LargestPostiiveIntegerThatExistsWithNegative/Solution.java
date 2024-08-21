package LargestPostiiveIntegerThatExistsWithNegative;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int findMaxK(int[] nums) {

        int res = -1;

        HashSet<Integer> negative = new HashSet<>();

        for (int i: nums) {
            if(i < 0) negative.add(i);
        }

        Arrays.sort(nums);

        for (int i = nums.length-1; i >= 0; i--) {

            if(nums[i] > 0 && negative.contains(-nums[i])) return nums[i];
            else if(nums[i] < 0) return -1;

        }

        return res;

    }
}