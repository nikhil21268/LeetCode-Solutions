package MinimumSizeSubArraySum;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int ans = Integer.MAX_VALUE;
        while(end < nums.length){
            // keep increasing the end pointer until we reach a sum >= target
            while(end < nums.length && sum(nums, start, end) < target){
                end++;
            }
            // keep increasing the start pointer until we reach a sum < target
            while(start < end && sum(nums, start, end) >= target){
                ans = Math.min(ans, end - start + 1);
                start++;
            }
        } return ans == Integer.MAX_VALUE ? 0 : ans;
    }
    private int sum(int[] nums, int start, int end) {
        int res = 0;
        for(int i = start; i <= end; i++){
            res += nums[i];
        } return res;
    }
}