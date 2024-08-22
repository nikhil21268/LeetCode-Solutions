package NumberOfPlacesWithAbsDiffK;

import java.util.Arrays;

class Solution {
    public int countKDifference(int[] nums, int k) {

        if(nums.length == 1) return 0;

        int res = 0;

        Arrays.sort(nums);

        int l = 0;
        int r = 1;

        while (l < nums.length){

            if(r == nums.length){
                l++;
                r = l + 1;
                continue;
            }

            if(Math.abs(nums[l] - nums[r]) > k){
                l++;
                r = l + 1;
            }

            if(Math.abs(nums[l] - nums[r]) == k) res++;

            r++;
        }

        return res;

    }
}