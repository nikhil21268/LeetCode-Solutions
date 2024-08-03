package LargestNumberAtLeastTwiceOfOthers;

class Solution {
    public int dominantIndex(int[] nums) {



        int res = -1;

        int max = -1;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] > max){

                max = nums[i];
                res = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if(i != res && max < 2 * nums[i]) return -1;
        }


        return res;
    }
}
