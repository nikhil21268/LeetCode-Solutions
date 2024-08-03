package HouseRobber;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        int moneyIfRob = -1;
        int moneyIfNotRob = -1;
        for(int i = 0; i < n; i++){
            // we either rob the use or we don't
            // case1: we rob the house
            moneyIfRob = nums[i] + (i >= 2 ? dp[i-2] : 0);
            // case2: we don't rob the house
            moneyIfNotRob = (i >= 1 ? dp[i-1] : 0);
            dp[i] = Math.max(moneyIfRob, moneyIfNotRob);
        }
        return dp[n-1];
    }
}