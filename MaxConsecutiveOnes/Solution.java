package MaxConsecutiveOnes;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;

        int left = 0;
        int right = 0;

        while(right < nums.length){
            while(left < nums.length && nums[left] != 1){
                left++;
            }
            right = left;
            while(right < nums.length && nums[right] == 1){
                right++;
            }
            res = Math.max(res, right - left);
            left = right;
        }

        return res;
    }
}