package StrictlyIncreasingDecreasingSubArray;

class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int res = 0;

        int l = 0;
        int r = 1;

        if(nums[r] != nums[l] && nums.length == 2) return 2;

        int dir = 0;
        while (r < nums.length && l < nums.length){

            if(nums[r] > nums[l] && (dir == 1 || dir == 0)){
                r++;
                if(dir == 0) dir = 1;
                res = Math.max(r-l, res);
            }

            else if(nums[r] < nums[l] && (dir == -1 || dir == 0)){
                r++;
                if(dir == 0) dir = -1;
                res = Math.max(r-l, res);
            }

            else l++;

        }

        return res;

    }
}